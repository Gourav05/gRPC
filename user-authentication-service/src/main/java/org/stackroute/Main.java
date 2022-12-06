package org.stackroute;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.authservice.AuthService;
import org.stackroute.userAuthentication.response;

import java.io.IOException;
import java.util.Random;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException  {
//        Random random=new Random();
//        int otp=random.nextInt(900)+100;
//
//
//        response.Builder res=response.newBuilder();
//        res.setOtp(otp).build();
//        System.out.println(res);


        System.out.println("Hello world!");
        System.out.println("Starting a GRPC server!!");
        Server server = ServerBuilder.forPort(8090).addService(new AuthService()).build();

        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();


    }
}