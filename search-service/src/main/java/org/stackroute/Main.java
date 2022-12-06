package org.stackroute;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.register.Userservice;
import org.stackroute.register.searchMessage;
import org.stackroute.register.userServiceGrpc;
import org.stackroute.service.searchService;

import java.io.IOException;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello world!11");
        Server server = ServerBuilder.forPort(8093).addService(new searchService()).build();

        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();
    }
}