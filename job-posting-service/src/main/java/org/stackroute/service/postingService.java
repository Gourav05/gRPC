package org.stackroute.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.stackroute.javastubs.Jobposting;
import org.stackroute.javastubs.jobPostingGrpc;

import org.stackroute.register.Userservice;
import org.stackroute.register.userServiceGrpc;
import org.stackroute.repository.Database;
import org.stackroute.repository.PostingImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class postingService extends jobPostingGrpc.jobPostingImplBase{

    PostingImpl postObj = new PostingImpl();
    Connection con;
    {
        try {
            con = Database.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean validateUser(int userId){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub = userServiceGrpc.newBlockingStub(channel);

        Userservice.userIdResponse userResponse = userServiceBlockingStub.allUserId(Userservice.empty.newBuilder().build());
        Userservice.userIdResponse.Builder userIdRes = Userservice.userIdResponse.newBuilder();
        List<Integer> userIdList = userResponse.getUserIdList();

        return userIdList.contains(userId);
    }

    @Override
    public void search(Jobposting.searchMessage request, StreamObserver<Jobposting.searchAPIResponse> responseObserver) {

        String jobTile = request.getJobTitle();
        List<String> jobs= postObj.getJobByTitle(jobTile);
        Jobposting.searchAPIResponse.Builder jobRes = Jobposting.searchAPIResponse.newBuilder();
        if(!jobs.isEmpty()){

            jobRes.setJobId(Integer.parseInt(jobs.get(0)))
                    .setJobTitle(jobs.get(1))
                    .setJobLocation(jobs.get(2))
                    .setExperience(Integer.parseInt(jobs.get(3)))
                    .setQualification(jobs.get(4))
                    .setNoticePeriod(Integer.parseInt(jobs.get(5)))
                    .setJobDescription(jobs.get(6))
                    .setPostedDate(jobs.get(7))
                    .setPostedBy(jobs.get(8));

//
        }
//        else {
//            jobRes.build();
//        }
        responseObserver.onNext(jobRes.build());
        responseObserver.onCompleted();
    }

    @Override
    public void addPost(Jobposting.dataAdd request, StreamObserver<Jobposting.APIResponse> responseObserver)  {
        //super.addDatabase(request, responseObserver);
        try{

        System.out.println("Inside addDatabase method");
        int jobId = (int) (Math.random() * 100);
        String jobTitle = request.getJobTitle();
        String jobLocation = request.getJobLocation();
        int experience = request.getExperience();
        String qualification = request.getQualification();
        int noticePeriod = request.getNoticePeriod();
        String jobDescription = request.getJobDescription();
        String postedDate = java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")).toString();
        String postedBy = request.getPostedBy();


        System.out.println("JobId:" + jobId);
        System.out.println("jobTitle:" + jobTitle);


        Jobposting.APIResponse.Builder response = Jobposting.APIResponse.newBuilder();

        boolean validateUser = validateUser(Integer.parseInt(postedBy));
        if (validateUser) {
            postObj.addPostInDatabase(jobId, jobTitle, jobLocation, experience, qualification, noticePeriod, jobDescription, postedDate, postedBy);
            response.setResponseMessage("Congratulations Your Post is on Air").setResponseCode(200);
        } else {
            response.setResponseMessage("Please Signup First").setResponseCode(404);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }catch (SQLException s) {
        s.printStackTrace();
    }
    }


    //update the Job Post
    @Override
    public void updatePost(Jobposting.dataUpdate request, StreamObserver<Jobposting.APIResponse> responseObserver) {
        // super.updateDatabase(request, responseObserver);
        try{
        System.out.println("Inside updateDatabase method");

        int jobId = request.getJobId();
        String jobTitle = request.getJobTitle();
        String jobLocation = request.getJobLocation();
        int experience = request.getExperience();
        String qualification = request.getQualification();
        int noticePeriod = request.getNoticePeriod();
        String jobDescription = request.getJobDescription();
        String postedDate = request.getPostedDate();
        String postedBy = request.getPostedBy();

        System.out.println("JobId:" + jobId);
        System.out.println("jobTitle:" + jobTitle);

        Jobposting.APIResponse.Builder response = Jobposting.APIResponse.newBuilder();

        boolean validateUser = validateUser(Integer.parseInt(postedBy));
        if (validateUser) {
            postObj.updatePostInDatabase(jobTitle, jobLocation, experience, qualification, noticePeriod, jobDescription, postedDate, postedBy, jobId);
            response.setResponseMessage("Post is Updated !!").setResponseCode(200);
        } else {
            response.setResponseMessage("Please Signup First").setResponseCode(404);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }catch (SQLException s) {
        s.printStackTrace();
    }

    }

    //DeletePostMethod
    @Override
    public void deletePost(Jobposting.dataDelete request, StreamObserver<Jobposting.APIResponse> responseObserver)  {
        //super.deletePost(request, responseObserver);
        try {
            System.out.println("Inside deletePost method");

            int jobId = request.getJobId();
            String postedBy = request.getPostedBy();
            System.out.println("JobId:" + jobId);


            Jobposting.APIResponse.Builder response = Jobposting.APIResponse.newBuilder();
            boolean validateUser = validateUser(Integer.parseInt(postedBy));
            if (validateUser) {
                int value = postObj.deletePostFromDatabase(jobId, Integer.parseInt(postedBy));
                if(value == 1){
                    response.setResponseMessage("Post is Deleted !!").setResponseCode(200);
                }
                else{
                    response.setResponseMessage("Please Enter right User Entry !!").setResponseCode(404);
                }


            } else {
                response.setResponseMessage("Please Signup First").setResponseCode(404);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
        catch (SQLException s) {
            s.printStackTrace();
        }
        }



    @Override
    public void allJobId(Jobposting.empty request, StreamObserver<Jobposting.jobIdResponse> responseObserver) {
        List<Integer> jobIdList = postObj.getAllJobId();
        int i = 0;
        while (i < jobIdList.size())
        {
            System.out.println(jobIdList.get(i));
            i++;
        }

        Jobposting.jobIdResponse.Builder userRes= Jobposting.jobIdResponse.newBuilder();

        userRes.addAllJobId(jobIdList).build();
        responseObserver.onNext(userRes.build());
        responseObserver.onCompleted();
    }

}

