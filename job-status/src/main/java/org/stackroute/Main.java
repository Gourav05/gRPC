package org.stackroute;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.service.JobStatusService;

import java.io.IOException;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Inside Job Status main class");

        Server server = ServerBuilder.forPort(8094).addService(new JobStatusService()).build();
        server.start();
        System.out.println("Job Status Main Server started on:"+server.getPort());
        server.awaitTermination();
    }
}