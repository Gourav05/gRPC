package org.stackroute;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.service.postingService;

import java.io.IOException;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Connecting with server
        System.out.println("Starting Job Posting Service!!!");
        Server server = ServerBuilder.forPort(8085).addService(new postingService()).build();
        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();



    }
}