package org.stackroute;

import io.grpc.ServerBuilder;
import org.stackroute.service.NotificationService;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ${USER}
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO,"Notification-service");
        logger.info("Server Started");

        io.grpc.Server server = ServerBuilder.forPort(8096).addService(new NotificationService()).build();
        server.start();

        logger.info("Server started on port number "+ server.getPort());
        server.awaitTermination();

    }
}