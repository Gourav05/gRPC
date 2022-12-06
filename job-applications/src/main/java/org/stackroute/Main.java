package org.stackroute;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.service.JobApplicationService;

import java.io.IOException;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Inside Job Application main class");

        Server server = ServerBuilder.forPort(8093).addService(new JobApplicationService()).build();
        server.start();
        System.out.println("Job Application Server has been started on port:"+server.getPort());
        server.awaitTermination();
    }
}