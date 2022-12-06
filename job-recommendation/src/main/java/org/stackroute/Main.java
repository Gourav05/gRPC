package org.stackroute;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.service.recommendationservice;

import java.io.IOException;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Job-Recommendation");
        System.out.println("Starting a GRPC server!!");
        Server server = ServerBuilder.forPort(8095).addService(new recommendationservice()).build();

        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();

    }
}