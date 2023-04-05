package org.stackroute.authservice;

import io.grpc.stub.StreamObserver;
import org.stackroute.userAuthentication.*;
import respository.UserRepoImpl;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

import java.security.Key;

public class AuthService extends userauthGrpc.userauthImplBase{
    UserRepoImpl authRepo = new UserRepoImpl();
    @Override
    public void userRegistration(adduser request, StreamObserver<APIresponse> responseObserver) {

        String userEmail = request.getUserEmail();

        String password=request.getPassword();

        boolean res = authRepo.addUser(userEmail, password);
        APIresponse.Builder addRes = APIresponse.newBuilder();

        if(res == true) {
            String resp = "userEmail - " + userEmail +" "+ "userId - "+ " " + "password - "
                    + password ;
            addRes.setResponseMessage(resp + " added.").setResponseCode(201);
        }else {
            addRes.setResponseMessage("User not added.").setResponseCode(202);
        }
        responseObserver.onNext(addRes.build());
        responseObserver.onCompleted();
    }

    @Override
    public void login(checkuser request, StreamObserver<checkresponse> responseObserver) {

        String userEmail=request.getUserEmail();
        String password=request.getPassword();

        boolean res = authRepo.login(userEmail,password);
        System.out.println(res);
        checkresponse.Builder check=checkresponse.newBuilder();
        if(res==false)
        {
            check.setResponseMessage("user not found").setResponseCode(202);
        }
        else {
            check.setResponseMessage("welcome "+userEmail).setResponseCode(202);

        }

        responseObserver.onNext(check.build());
        responseObserver.onCompleted();
    }

    @Override
    public void forgotPassword(request request, StreamObserver<response> responseObserver) throws MessagingException {


        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        String from = "flexworkofficial@gmail.com";
        String recipient = request.getUserEmail();

        Random random=new Random();
        int otp=random.nextInt(900)+100;
        String msg=String.valueOf(otp);

      // if(authRepo.)


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
        mimeMessage.setSubject("OTP generated");
        mimeMessage.setText(msg);

        Transport.send(mimeMessage);

        response.Builder res=response.newBuilder();
        long n=otp;

        res.setOtp(n).build();

        responseObserver.onNext(res.build());
        responseObserver.onCompleted();

    }
}
