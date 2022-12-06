package org.stackroute.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.stackroute.jobApplication.JobApplication;
import org.stackroute.jobApplication.jobApplicationGrpc;
import org.stackroute.jobStatus.JobStatus;
import org.stackroute.jobStatus.statusGrpc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobStatusService extends statusGrpc.statusImplBase{
    @Override
    public void getStatus(JobStatus.statusMessage request, StreamObserver<JobStatus.StatusAPIResponse> responseObserver) {
        int jobApplicationId = request.getJobApplicationId();
        List<String> jobApplicationStatus = getStatusById(jobApplicationId);

        JobStatus.StatusAPIResponse.Builder jobStatusRes = JobStatus.StatusAPIResponse.newBuilder();
        if (!jobApplicationStatus.isEmpty()) {
            jobStatusRes.setJobStatus(jobApplicationStatus.get(0));
            jobStatusRes.setResponseMessage("Job Application Status").setResponseCode(300);
        } else {
            jobStatusRes.build();
            jobStatusRes.setJobStatus("No Status Found");
            jobStatusRes.setResponseMessage("Job Application Not Exist!!").setResponseCode(400);
        }
        responseObserver.onNext(jobStatusRes.build());
        responseObserver.onCompleted();
    }

    public List<String> getStatusById(int applicationId){
        List<String> AllApplication = new ArrayList<>();
        String url = "jdbc:postgresql://localhost:5432/flexworkregister";
        String postgresUser = "postgres";
        String postgresPassword = "Global@900";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, postgresUser, postgresPassword);
            String query = "SELECT job_status FROM job_application WHERE job_application_id = ?";
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            prepareStatement.setInt(1, applicationId);
            ResultSet rs = prepareStatement.executeQuery();
            if (rs.next()) {
                AllApplication.add(rs.getString("job_status"));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.err.println(e);
        }
        return AllApplication;
    }


    @Override
    public void updateStatus(JobStatus.updateStatusMessage request, StreamObserver<JobStatus.UpdateStatusAPIResponse> responseObserver) {
        int jobApplicationId = request.getJobApplicationId();
        String jobStatus = request.getJobStatus();

        JobStatus.UpdateStatusAPIResponse.Builder jobStatusRes = JobStatus.UpdateStatusAPIResponse.newBuilder();
        boolean validateApplicationId = validateApplicationId(jobApplicationId);

        if (validateApplicationId == true){
            boolean updt = updateStatusData(jobApplicationId, jobStatus);

            if(updt == true){
                jobStatusRes.setResponseMessage("Status Updated!!").setResponseCode(1);
            }
            else {
                jobStatusRes.setResponseMessage("Status Not Updated!!").setResponseCode(0);
            }
        }else {
            jobStatusRes.setResponseMessage("Application Id Not Exists!!").setResponseCode(0);
        }

        responseObserver.onNext(jobStatusRes.build());
        responseObserver.onCompleted();
    }

    public boolean updateStatusData(int jobApplicationId, String jobStatus){
        String url = "jdbc:postgresql://localhost:5432/flexworkregister";
        String postgresUser = "postgres";
        String postgresPassword = "Global@900";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, postgresUser, postgresPassword);

            System.out.println("Connection established successfully!!");

            String query = "UPDATE job_application SET job_status = ? " + " WHERE job_application_id = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, jobStatus);
            statement.setInt(2, jobApplicationId);
            int rowsUpdate = statement.executeUpdate();
            if (rowsUpdate > 0) {
                System.out.println(rowsUpdate + " record updated");
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.err.println(e);
        }
        return false;
    }

    public boolean validateApplicationId(int jobApplicationId){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8093).usePlaintext().build();
        jobApplicationGrpc.jobApplicationBlockingStub jobApplicationBlockingStub = jobApplicationGrpc.newBlockingStub(channel);

        JobApplication.applicationIdResponse applicationResponse = jobApplicationBlockingStub.allJobApplicationId(JobApplication.empty.newBuilder().build());
        JobApplication.applicationIdResponse.Builder jobIdAppRes = JobApplication.applicationIdResponse.newBuilder();
        List<Integer> jAppid = applicationResponse.getJobApplicationIdList();
        if(jAppid.contains(jobApplicationId)){
            return true;
        }
        else {
            return false;
        }
    }
}
