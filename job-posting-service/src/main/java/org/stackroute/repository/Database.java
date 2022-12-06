package org.stackroute.repository;

// *************************************Database Class ***************************************************
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database
{

    private static final String url = "jdbc:postgresql://localhost:5432/flexworkregister";
    private static final String user = "postgres";
    private static final String password = "Global@900";

    public static Connection getConnection() throws SQLException
    {
//       try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        Connection connection;
        connection=DriverManager.getConnection(url,user,password);
        return connection;
    }

}