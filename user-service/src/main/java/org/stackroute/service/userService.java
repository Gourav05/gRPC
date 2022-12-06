package org.stackroute.service;


import io.grpc.stub.StreamObserver;
import org.stackroute.register.*;

import java.sql.SQLException;
import java.util.*;
import repository.RegistrationRepoImpl;

public class userService extends userServiceGrpc.userServiceImplBase
{


    RegistrationRepoImpl regRepo = new RegistrationRepoImpl();


    @Override
    public void allSearch(allMessage request, StreamObserver<allResponse> responseObserver) throws SQLException {
       String key= request.getSearch();

       List<allr> res=regRepo.getByString(key);

        System.out.println("mc" +Arrays.toString(res.toArray()));
       allr.Builder apiRs= allr.newBuilder();
       allResponse.Builder m=allResponse.newBuilder();
       if(!res.isEmpty()){
          // m.addSearchResult(res.get(0));
           m.addAllSearchResult(res);
       }else{
           m.addSearchResult(apiRs.setResponseMessage("No users found").build());
       }
       responseObserver.onNext(m.build());
       responseObserver.onCompleted();

    }
    @Override
    public void primaryskillSearch(requestMessage request, StreamObserver<responseMessager> responseObserver) {
        String primarySkill = request.getPrimarySkil();

        List<rs> user = regRepo.getUserByPrimaryskil(primarySkill);



      // System.out.println("mc" +Arrays.toString(user.toArray()));
        rs.Builder apiRs=rs.newBuilder();
        responseMessager.Builder m= responseMessager.newBuilder();
        if(!user.isEmpty()){

            m.addAllR(user);
            //System.out.println(m.getAllFields());
            //System.out.println(Arrays.toString(user.toArray()));
        }else{
            m.addR(apiRs.setResponseMessage("No Users Found ").build());
        }
        responseObserver.onNext(m.build());
        responseObserver.onCompleted();
    }
    @Override
    public void updateUser(updateRequest request, StreamObserver<updateResponse> responseObserver) {
        String userName = request.getUserName();
        String userEmail = request.getUserEmail();
        int userId = request.getUserId();
        String dob = request.getDob();
        String gender = request.getGender();
        String password = request.getPassword();
        String name = request.getName();
        long phone = request.getPhone();
        String designation = request.getDesignation();
        String primarySkill = request.getPrimarySkil();
        String secondarySkill = request.getSecondarySkill();

       //int userId= Integer.parseInt(null);
        boolean res = regRepo.updateUser(userName, userEmail,
                userId,
                dob, gender, password, name, phone, designation, primarySkill, secondarySkill);
        updateResponse.Builder updateRes = updateResponse.newBuilder();

        if (res == true) {
            String resp = "Username - " + userName + " " + "userEmail - " + userEmail + " " + "userId - " +userId
                    + " " + "dob- " + dob + " " + "gender - " + gender + " " + "password - "
                    + password + " " + "name- " + " " + name + "phone- " + " " + phone + "designation- " + " " + designation + "primarySkill- " + " " + primarySkill + "secondarySkill- " + " " + secondarySkill;
            updateRes.setResponseMessage(resp + " updated.").setResponseCode(201);
        } else {
            updateRes.setResponseMessage("User not Found").setResponseCode(202);
        }
        responseObserver.onNext(updateRes.build());
        responseObserver.onCompleted();


    }

    @Override
    public void delete(deleteRequest request, StreamObserver<deleteResponse> responseObserver) {
        String emailId = request.getEmailId();
        boolean res = regRepo.deleteUser(emailId);
        deleteResponse.Builder deleteRes = deleteResponse.newBuilder();

        if (res == true) {
            String resp = "Record with Emaild Id - " + emailId;
            deleteRes.setResponseMessage(resp + " deleted.").setResponseCode(201);
        } else {
            deleteRes.setResponseMessage("User not deleted.").setResponseCode(202);
        }
        responseObserver.onNext(deleteRes.build());
        responseObserver.onCompleted();
    }

//    @Override
//    public void addUserDetails(adduser request, StreamObserver<APIresponse> responseObserver) {
//        String userName = request.getUserName();
//        String userEmail = request.getUserEmail();
//        int userId = request.getUserId();
//        String dob = request.getDob();
//        String gender = request.getGender();
//        String password = request.getPassword();
//        String name = request.getName();
//        long phone = request.getPhone();
//        String designation = request.getDesignation();
//        String primarySkill = request.getPrimarySkil();
//        String secondarySkill = request.getSecondarySkill();
//        boolean res = regRepo.addUser(userName, userEmail, userId, dob, gender, password, name, phone, designation, primarySkill, secondarySkill);
//        APIresponse.Builder addRes = APIresponse.newBuilder();
//
//        if (res == true) {
//            String resp = "Username - " + userName + " " + "userEmail - " + userEmail + " " + "userId - " + userId
//                    + " " + "dob- " + dob + " " + "gender - " + gender + " " + "password - "
//                    + password + " " + "name- " + " " + name + "phone- " + " " + phone + "designation- " + " " + designation + "primarySkill- " + " " + primarySkill + "secondarySkill- " + " " + secondarySkill;
//            addRes.setResponseMessage(resp + " added.").setResponseCode(201);
//        } else {
//            addRes.setResponseMessage("User not added.").setResponseCode(202);
//        }
//        responseObserver.onNext(addRes.build());
//        responseObserver.onCompleted();
//    }


    public void searchByEmail(searchMessage request, StreamObserver<searchAPIResponse> responseObserver) {
        String emailId = request.getUserEmail();

        List<String> user = regRepo.getUserByMail(emailId);
        searchAPIResponse.Builder userRes = searchAPIResponse.newBuilder();
        System.out.println("mc" +Arrays.toString(user.toArray()));
        if (!user.isEmpty()) {
            userRes.setUserName(user.get(0)).setUserEmail(user.get(1)).setUserId(Integer.parseInt(user.get(2)))
                    .setDob(user.get(3)).setGender(user.get(4)).setPassword(user.get(5))
                    .setName(user.get(6)).setPhone(Integer.parseInt(user.get(7)))
                    .setDesignation(user.get(8)).setPrimarySkil(user.get(8))
                    .setSecondarySkill(user.get(9))
                    .setResponseMessage("User data found").setResponseCode(201);
        } else {
            userRes.setResponseMessage("User data not found").setResponseCode(203);
        }
        responseObserver.onNext(userRes.build());
        responseObserver.onCompleted();
    }



    //public void primaryskillSearch(requestMessage request, StreamObserver<responseMessage> responseObserver) {

//        responseMessage.Builder userRes = responseMessage.newBuilder();
//
//
//        if (!user.isEmpty()) {
//            userRes.setUserName(user.get(0)).setUserEmail(user.get(1)).setUserId(Integer.parseInt(user.get(2)))
//                    .setDob(user.get(3)).setGender(user.get(4)).setPassword(user.get(5))
//                    .setName(user.get(6)).setPhone(Integer.parseInt(user.get(7)))
//                    .setDesignation(user.get(8)).setPrimarySkil(user.get(8))
//                    .setSecondarySkill(user.get(9))
//                    .setResponseMessage("User data found");
//        } else {
//            userRes.setResponseMessage("User data not found").build();
//        }
//        responseObserver.onNext(userRes.build());
//        responseObserver.onCompleted();
  //  }

    public void secondaryskillSearch(requestMessage1 request, StreamObserver<responseMessage1> responseObserver) {
        String secondarySkill = request.getSecondarySkill();
        List<String> user = regRepo.getUserBySecondaryskill(secondarySkill);
        responseMessage1.Builder userRes = responseMessage1.newBuilder();
        if (!user.isEmpty()) {
            userRes.setUserName(user.get(0)).setUserEmail(user.get(1)).setUserId(Integer.parseInt(user.get(2)))
                    .setDob(user.get(3)).setGender(user.get(4)).setPassword(user.get(5))
                    .setName(user.get(6)).setPhone(Integer.parseInt(user.get(7)))
                    .setDesignation(user.get(8)).setPrimarySkil(user.get(8))
                    .setSecondarySkill(user.get(9))
                    .setResponseMessage("User data found");
        } else {
            userRes.setResponseMessage("User data not found").build();
        }
        responseObserver.onNext(userRes.build());
        responseObserver.onCompleted();
    }

    public void userIDSearch(requestMessage2 request, StreamObserver<responseMessage2> responseObserver) {
        int userId = request.getUserId();
        List<String> user = regRepo.getUserByUserID(userId);
        responseMessage2.Builder userRes = responseMessage2.newBuilder();
        if (!user.isEmpty()) {
            userRes.setUserName(user.get(0)).setUserEmail(user.get(1)).setUserId(Integer.parseInt(user.get(2)))
                    .setDob(user.get(3)).setGender(user.get(4)).setPassword(user.get(5))
                    .setName(user.get(6)).setPhone(Integer.parseInt(user.get(7)))
                    .setDesignation(user.get(8)).setPrimarySkil(user.get(8))
                    .setSecondarySkill(user.get(9))
                    .setResponseMessage("User data found");
        } else {
            userRes.setResponseMessage("User data not found").build();
        }
        responseObserver.onNext(userRes.build());
        responseObserver.onCompleted();
    }

    public void designationSearch(requestMessage3 request, StreamObserver<responseMessage3> responseObserver) {
        String designation = request.getDesignation();
        List<String> user = regRepo.getUserByDesignation(designation);

       // System.out.println(""+user);

        responseMessage3.Builder userRes = responseMessage3.newBuilder();
        if (!user.isEmpty()) {
            userRes.setUserName(user.get(0)).setUserEmail(user.get(1)).setUserId(Integer.parseInt(user.get(2)))
                    .setDob(user.get(3)).setGender(user.get(4)).setPassword(user.get(5))
                    .setName(user.get(6)).setPhone(Integer.parseInt(user.get(7)))
                    .setDesignation(user.get(8)).setPrimarySkil(user.get(8))
                    .setSecondarySkill(user.get(9))
                     .setResponseMessage("User data found");
        } else {
            userRes.setResponseMessage("User data not found").build();
        }
        responseObserver.onNext(userRes.build());
        responseObserver.onCompleted();
    }

        public void allUserId( empty e, StreamObserver<userIdResponse> responseObserver){
   List<Integer> userId=regRepo.getUserId();


   userIdResponse.Builder userRes= userIdResponse.newBuilder();

   userRes.addAllUserId(userId).build();

     responseObserver.onNext(userRes.build());
     responseObserver.onCompleted();
 }
}


