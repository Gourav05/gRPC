package org.stackroute;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.service.userService;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException  {

        Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.log(Level.INFO, "User-service");

        logger.info("GRPC server started");


        Server server = ServerBuilder.forPort(8091).addService(new userService()).build();

        server.start();


        logger.info("Server started on port number:"+ server.getPort());
        server.awaitTermination();


    }
}