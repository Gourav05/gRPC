package org.stackroute.service;

import io.grpc.stub.StreamObserver;
import org.stackroute.notification.Notification;
import org.stackroute.notification.notificationGrpc;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class NotificationService extends notificationGrpc.notificationImplBase{
    @Override
    public void registerNotification(Notification.notificationMessage request, StreamObserver<Notification.APIResponse> responseObserver) throws MessagingException{
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        String from = "flexworkofficial@gmail.com";
        String recipient = request.getEmail();
        String sub = request.getSubject();
        String msg = request.getMessage();

        //Host Set
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");


        //Session establish
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {


                return new PasswordAuthentication("flexworkofficial@gmail.com","vxpuwkczzbphntzf");

            }
        });
         System.out.println("Password authentication is successfully");

        session.setDebug(true);

        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(from);
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); //send mail
        mimeMessage.setSubject(sub);
        mimeMessage.setText(msg);

        Transport.send(mimeMessage);

        System.out.println("Message sent successfully");

        Notification.APIResponse.Builder response = Notification.APIResponse.newBuilder();
        response.setResponseMessage("Message sent Successfully").setResponseCode(200);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }
}