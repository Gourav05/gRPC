package org.stackroute;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.stackroute.service.CommentService;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO, "Comment Service ");
        logger.info("GRPC server started");
        Server server = ServerBuilder.forPort(8099).addService(new CommentService()).build();
        server.start();
        logger.info("Server started on port number:"+server.getPort());
        server.awaitTermination();
    }
}