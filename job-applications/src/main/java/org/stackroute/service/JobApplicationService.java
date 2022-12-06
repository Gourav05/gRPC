package org.stackroute.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.stackroute.jobApplication.JobApplication;
import org.stackroute.jobApplication.jobApplicationGrpc;
import org.stackroute.jobPosting.Jobposting;
import org.stackroute.jobPosting.jobPostingGrpc;
import org.stackroute.register.Userservice;
import org.stackroute.register.userServiceGrpc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobApplicationService extends jobApplicationGrpc.jobApplicationImplBase{

    public boolean validateUser(int userId){
        //channel with user service
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub = userServiceGrpc.newBlockingStub(channel);

        Userservice.userIdResponse userResponse = userServiceBlockingStub.allUserId(Userservice.empty.newBuilder().build());
        Userservice.userIdResponse.Builder userIdRes = Userservice.userIdResponse.newBuilder();
        List<Integer> uid = userResponse.getUserIdList();
        if(uid.contains(userId)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validateJob(int jobId){
        //channel with job posting
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
        jobPostingGrpc.jobPostingBlockingStub jobPostingBlockingStub = jobPostingGrpc.newBlockingStub(channel);

        Jobposting.jobIdResponse jobResponse = jobPostingBlockingStub.allJobId(Jobposting.empty.newBuilder().build());
        Jobposting.jobIdResponse.Builder jobIdRes = Jobposting.jobIdResponse.newBuilder();
        List<Integer> jid = jobResponse.getJobIdList();
        if(jid.contains(jobId)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void jobApplication(JobApplication.jobApplicationMessage request, StreamObserver<JobApplication.ApplicationAPIResponse> responseObserver) {
        int jobId = request.getJobId();
        int userId = request.getUserId();
        String jobStatus = "Active";
        boolean valUser = validateUser(userId);
        boolean valJob = validateJob(jobId);
        JobApplication.ApplicationAPIResponse.Builder applicationRes = JobApplication.ApplicationAPIResponse.newBuilder();
        if(valUser == true && valJob == true){
            storeDetails(jobId, userId, jobStatus);
            applicationRes.setResponseMessage("Job Application Successfully!!").setResponseCode(1);
        } else if (valUser == true && valJob != true) {
            int fJobId = 0;
            String jStatus = "Inactive";
            storeDetails(fJobId, userId, jStatus);
            applicationRes.setResponseMessage("Job Not Exists!!").setResponseCode(1);
        } else if (valUser != true && valJob == true) {
            int fUserId = 0;
            String jStatus = "Inactive";
            storeDetails(jobId, fUserId, jStatus);
            applicationRes.setResponseMessage("User Not Exists!!").setResponseCode(0);
        } else {
            applicationRes.setResponseMessage("Job Application Failure!!").setResponseCode(0);
        }
        responseObserver.onNext(applicationRes.build());
        responseObserver.onCompleted();
    }

    public  void storeDetails(int jobId, int userId, String jobStatus){
        String url = "jdbc:postgresql://localhost:5432/flexworkregister";
        String postgresUser = "postgres";
        String postgresPassword = "Global@900";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, postgresUser, postgresPassword);
            System.out.println("Connection established successfully!!");
            String query = "Insert into job_application(job_id, user_id, job_status) values(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, jobId);
            statement.setInt(2, userId);
            statement.setString(3, jobStatus);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void applicationIdSearch(JobApplication.applicationIdSearchMessage request, StreamObserver<JobApplication.ApplicationIdSearchResponse> responseObserver) {
        int jobApplicationId = request.getApplicationId();
        List<String> jobApplication = getApplicationById(jobApplicationId);
        JobApplication.ApplicationIdSearchResponse.Builder jobAppRes = JobApplication.ApplicationIdSearchResponse.newBuilder();
        if (!jobApplication.isEmpty()) {
            jobAppRes.setApplicationId(Integer.parseInt(jobApplication.get(0))).setJobId(Integer.parseInt(jobApplication.get(1))).setUserId(Integer.parseInt(jobApplication.get(2)));
            jobAppRes.setResponseMessage("Details of Job Application").setResponseCode(300);
        } else {
            jobAppRes.build();
            jobAppRes.setResponseMessage("No Job Application").setResponseCode(400);
        }
        responseObserver.onNext(jobAppRes.build());
        responseObserver.onCompleted();
    }

    public List<String> getApplicationById(int applicationId){
        List<String> AllApplication = new ArrayList<>();
        String url = "jdbc:postgresql://localhost:5432/flexworkregister";
        String postgresUser = "postgres";
        String postgresPassword = "Global@900";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, postgresUser, postgresPassword);
            String query = "SELECT * FROM job_application WHERE job_application_id = ?";
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            prepareStatement.setInt(1, applicationId);
            ResultSet rs = prepareStatement.executeQuery();
            if (rs.next()) {
                AllApplication.add(rs.getString("job_application_id"));
                AllApplication.add(rs.getString("job_id"));
                AllApplication.add(rs.getString("user_id"));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return AllApplication;
    }

    @Override
    public void allJobApplicationId(JobApplication.empty request, StreamObserver<JobApplication.applicationIdResponse> responseObserver) {
        List<Integer> jobApplicationIdList = getAllJobApplicationId();
        int i = 0;
        while (i < jobApplicationIdList.size())
        {
            System.out.println(jobApplicationIdList.get(i));
            i++;
        }
        JobApplication.applicationIdResponse.Builder appRes = JobApplication.applicationIdResponse.newBuilder();
        appRes.addAllJobApplicationId(jobApplicationIdList).build();

        responseObserver.onNext(appRes.build());
        responseObserver.onCompleted();
    }

    public List<Integer> getAllJobApplicationId() {
        List<Integer> jobApplicationIdList = new ArrayList<>();
        String url = "jdbc:postgresql://localhost:5432/flexworkregister";
        String postgresUser = "postgres";
        String postgresPassword = "Global@900";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, postgresUser, postgresPassword);
            String query = "SELECT job_application_id FROM job_application";
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            ResultSet rs = prepareStatement.executeQuery();
            while(rs.next() == true) {
                jobApplicationIdList.add(rs.getInt("job_application_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return jobApplicationIdList;
    }
}
