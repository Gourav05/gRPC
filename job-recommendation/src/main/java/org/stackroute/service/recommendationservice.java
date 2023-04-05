package org.stackroute.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.stackroute.grpc.Recommendation;
import org.stackroute.grpc.recommendationGrpc;
import org.stackroute.register.requestMessage2;
import org.stackroute.register.responseMessage2;
import org.stackroute.register.userServiceGrpc;
import org.stackroute.repository.RecommendationRepoImpl;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class recommendationservice extends recommendationGrpc.recommendationImplBase {

    RecommendationRepoImpl recRes= new RecommendationRepoImpl();
    @Override
    public void recommend(Recommendation.recommendmessage request, StreamObserver<Recommendation.APIresponse> responseObserver) throws MessagingException {
        int userId= request.getUserId();
        int jobId= request.getUserId();
        String title=request.getJobRecommendationTitle();
        String details=request.getJobRecommendationDetails();
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        String from = "flexworkofficial@gmail.com";

       //Job posting channel
       ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 8070).usePlaintext().build();



       //user Service channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub = userServiceGrpc.newBlockingStub(channel);

        requestMessage2 sm=requestMessage2.newBuilder().setUserId(userId).build();

        responseMessage2 apirm=userServiceBlockingStub.userIDSearch(sm);

        Recommendation.APIresponse.Builder addRes = Recommendation.APIresponse.newBuilder();

        String recipient=apirm.getUserEmail();
        String msg="This Job is recommended for you";

        System.out.println(details);
        System.out.println(apirm.getPrimarySkil());

        if (details.contains(apirm.getPrimarySkil()) && title.contains(apirm.getPrimarySkil())){
            properties.put("mail.smtp.host",host);
            properties.put("mail.smtp.port","465");
            properties.put("mail.smtp.ssl.enable","true");
            properties.put("mail.smtp.auth","true");


            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("flexworkofficial@gmail.com","vxpuwkczzbphntzf");
                }
            });
            session.setDebug(true);


            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(from);
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); //send mail
            mimeMessage.setSubject("Job Recommendation from FLEXWORK");
            mimeMessage.setText(msg);

            Transport.send(mimeMessage);

            addRes.setResponsemessage("Job recommended and email sent to the registered email of user ");
        }else addRes.setResponsemessage("Not recommended");

        responseObserver.onNext(addRes.build());
         responseObserver.onCompleted();
    }
}







