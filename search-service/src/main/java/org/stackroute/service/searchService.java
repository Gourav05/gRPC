package org.stackroute.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.stackroute.proto.Search;
import org.stackroute.proto.searchResourceGrpc;
import org.stackroute.register.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class searchService extends searchResourceGrpc.searchResourceImplBase{
    @Override
    public void primaryskillSearch(Search.primaryRequest request, StreamObserver<Search.primaryResponse> responseObserver) {
        String primarySkill = request.getPrimarySkil();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        System.out.println(channel+"1");
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub=userServiceGrpc.newBlockingStub(channel);

        requestMessage sm=requestMessage.newBuilder().setPrimarySkil(primarySkill).build();
        //System.out.println(sm);
        responseMessager apirm=userServiceBlockingStub.primaryskillSearch(sm);
        //System.out.println(apirm);

/*4 steps
1. rs z -> get -> list<String>

2. list of 1 -> set in requiredRes
3. requiredRes -> set in r1
*/

       rs.Builder a=rs.newBuilder();



       List<rs> a1=apirm.getRList();



      List<Search.pr> r1= new ArrayList<>();


      List<String> temp=new ArrayList<>();

        Search.pr.Builder p=Search.pr.newBuilder();

/*
*  List<A> temp=new ArrayList<>();  1
*  List<B> temp1=new ArrayList<>();  2
*
*
* 2=1
* */


        Search.primaryResponse.Builder requiredRes= Search.primaryResponse.newBuilder();




       for( rs z: a1){
          temp.add(z.getUserEmail());
           p.setUserEmail(z.getUserEmail());
          temp.add(String.valueOf(z.getUserId()));
          temp.add(z.getDob());
          temp.add(z.getPassword());
          temp.add(z.getName());
          temp.add(String.valueOf(z.getPhone()));
          temp.add(z.getDesignation());
          temp.add(z.getPrimarySkil());
          temp.add(z.getSecondarySkill());
          temp.add(z.getResponseMessage());
          temp.add(String.valueOf(z.getResponseCode()));
       }



       for(String x:temp){

       }



/*4 steps
1. rs z -> get -> list<String>

2. list of 1 -> set in requiredRes
3. requiredRes -> set in r1
*/




//
//        List<rs> r=apirm.getRList();
//
//
//       System.out.println(apirm.getR());
//
//        System.out.println(r);
//
//        List<Search.pr> r1=new ArrayList<>();
//
//
//
//
////        r1.add(apirm.)
//        for(rs a1: r){
//
//        }
//
//
//
////       r1.add(r.get)
//
//
//        Search.primaryResponse.Builder apiRs=Search.primaryResponse.newBuilder();
//
////        if(!r.isEmpty()){
////            apiRs.addAllResults();
////        }
//        //r.add(apirm.g)
//
//        Search.pr.Builder aprRs= Search.pr.newBuilder();
//
//
//
//
//
//        Search.primaryResponse.Builder searchapi=Search.primaryResponse.newBuilder();
//        System.out.println(searchapi);
//



//        searchapi.setUserName(apirm.getUserName()).setUserEmail(apirm.getUserEmail())
//                .setUserId(apirm.getUserId()).setDob(apirm.getDob())
//                .setGender(apirm.getGender()).setPassword(apirm.getPassword())
//                .setName(apirm.getName()).setPhone(apirm.getPhone())
//                .setDesignation(apirm.getPrimarySkil()).setSecondarySkill(apirm.getSecondarySkill())
//                .setResponseMessage(apirm.getResponseMessage()).setResponseCode(apirm.getResponseCode());

//        responseObserver.onNext(searchapi.build());
//        responseObserver.onCompleted();

    }

    @Override
    public void secondaryskillSearch(Search.secondaryRequest request, StreamObserver<Search.secondaryResponse> responseObserver) {

        String SecondarySkill = request.getSecondarySkill();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        System.out.println(channel+"1");
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub=userServiceGrpc.newBlockingStub(channel);

        requestMessage1 sm=requestMessage1.newBuilder().setSecondarySkill(SecondarySkill).build();
      //  System.out.println(sm);
        responseMessage1 apirm=userServiceBlockingStub.secondaryskillSearch(sm);
       // System.out.println(apirm);

        Search.secondaryResponse.Builder searchapi=Search.secondaryResponse.newBuilder();
        System.out.println(searchapi);
        searchapi.setUserName(apirm.getUserName()).setUserEmail(apirm.getUserEmail())
                .setUserId(apirm.getUserId()).setDob(apirm.getDob())
                .setGender(apirm.getGender()).setPassword(apirm.getPassword())
                .setName(apirm.getName()).setPhone(apirm.getPhone())
                .setDesignation(apirm.getPrimarySkil()).setSecondarySkill(apirm.getSecondarySkill())
                .setResponseMessage(apirm.getResponseMessage()).setResponseCode(apirm.getResponseCode());

        responseObserver.onNext(searchapi.build());
        responseObserver.onCompleted();

    }

    @Override
    public void userIDSearch(Search.UserIdRequest request, StreamObserver<Search.userIdResponse> responseObserver) {

        int emailId = request.getUserId();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        System.out.println(channel+"1");
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub=userServiceGrpc.newBlockingStub(channel);

        requestMessage2 sm=requestMessage2.newBuilder().setUserId(emailId).build();
        System.out.println(sm);
        responseMessage2 apirm=userServiceBlockingStub.userIDSearch(sm);
        System.out.println(apirm);

        Search.userIdResponse.Builder searchapi=Search.userIdResponse.newBuilder();
        System.out.println(searchapi);
        searchapi.setUserName(apirm.getUserName()).setUserEmail(apirm.getUserEmail())
                .setUserId(apirm.getUserId()).setDob(apirm.getDob())
                .setGender(apirm.getGender()).setPassword(apirm.getPassword())
                .setName(apirm.getName()).setPhone(apirm.getPhone())
                .setDesignation(apirm.getPrimarySkil()).setSecondarySkill(apirm.getSecondarySkill())
                .setResponseMessage(apirm.getResponseMessage()).setResponseCode(apirm.getResponseCode());

        responseObserver.onNext(searchapi.build());
        responseObserver.onCompleted();

    }

    @Override
    public void designationSearch(Search.designationRequest request, StreamObserver<Search.designationResponse> responseObserver) {
        String designation = request.getDesignation();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        System.out.println(channel+"1");
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub=userServiceGrpc.newBlockingStub(channel);

        requestMessage3 sm=requestMessage3.newBuilder().setDesignation(designation).build();
        System.out.println(sm);
        responseMessage3 apirm=userServiceBlockingStub.designationSearch(sm);
        System.out.println(apirm);

        Search.designationResponse.Builder searchapi=Search.designationResponse.newBuilder();
        System.out.println(searchapi);
        searchapi.setUserName(apirm.getUserName()).setUserEmail(apirm.getUserEmail())
                .setUserId(apirm.getUserId()).setDob(apirm.getDob())
                .setGender(apirm.getGender()).setPassword(apirm.getPassword())
                .setName(apirm.getName()).setPhone(apirm.getPhone())
                .setDesignation(apirm.getPrimarySkil()).setSecondarySkill(apirm.getSecondarySkill())
                .setResponseMessage(apirm.getResponseMessage()).setResponseCode(apirm.getResponseCode());

        responseObserver.onNext(searchapi.build());
        responseObserver.onCompleted();
    }

    @Override
    public void search(Search.searchRequest request, StreamObserver<Search.searchResponse> responseObserver) {
        String emailId = request.getUserEmail();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        System.out.println(channel+"1");
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub=userServiceGrpc.newBlockingStub(channel);

        searchMessage sm=searchMessage.newBuilder().setUserEmail(emailId).build();
        System.out.println(sm);
       searchAPIResponse apirm=userServiceBlockingStub.searchByEmail(sm);

       // searchAPIResponse apirm= userServiceBlockingStub.
        System.out.println(apirm);

        Search.searchResponse.Builder searchapi=Search.searchResponse.newBuilder();
        System.out.println(searchapi);
        searchapi.setUserName(apirm.getUserName()).setUserEmail(apirm.getUserEmail())
                .setUserId(apirm.getUserId()).setDob(apirm.getDob())
                .setGender(apirm.getGender()).setPassword(apirm.getPassword())
                .setName(apirm.getName()).setPhone(apirm.getPhone())
                .setDesignation(apirm.getPrimarySkil()).setSecondarySkill(apirm.getSecondarySkill())
                .setResponseMessage(apirm.getResponseMessage()).setResponseCode(apirm.getResponseCode());

    responseObserver.onNext(searchapi.build());
    responseObserver.onCompleted();
    }

 }

