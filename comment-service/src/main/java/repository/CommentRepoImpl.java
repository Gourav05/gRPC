package repository;

import java.sql.*;

public class CommentRepoImpl implements CommentRepo {
    Connection connection =null;

    public CommentRepoImpl() {
        try {
            String url = "jdbc:postgresql://localhost:5432/flexworkregister";
            Class.forName("org.postgresql.Driver");
           connection = DriverManager.getConnection(url, "postgres", "Global@900");
            System.out.println(connection != null ? "connection established" : "connection failed");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("There is no respective jars : " + cnfe.getMessage());
        } catch (SQLException se) {
            System.err.println("SQL Exception :" + se.getMessage());
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public boolean addComment(int job_Id, int user_Id, String comment, String commentDate) {
        String Query = "INSERT INTO comment_details(job_id, user_id, comment, comment_date) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setInt(1, job_Id);
            prepareStatement.setInt(2, user_Id);
            prepareStatement.setString(3, comment);
            prepareStatement.setString(4, commentDate);
            int rowsAffected = prepareStatement.executeUpdate();
            if (rowsAffected > 0 ) {
                System.out.println(rowsAffected + " record inserted");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
     public boolean updateComment(int job_Id, int user_Id, String comment, String commentDate) {
        String Query = "Update comment_details SET job_id = (?), comment = (?), comment_date =(?) WHERE user_id = ?" ;
         try {
             PreparedStatement prepareStatement = connection.prepareStatement(Query);
             prepareStatement.setInt(1, job_Id);
             prepareStatement.setString(2, comment);
             prepareStatement.setString(3, commentDate);
             prepareStatement.setInt(4, user_Id);
             int rowsAffected = prepareStatement.executeUpdate();
             if (rowsAffected > 0 ) {
                 System.out.println(rowsAffected + " record update");
                 return true;
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return false;
     }

     @Override
     public boolean deleteComment( int job_Id) {
         String Query = "DELETE FROM comment_details WHERE job_id = ?";
         try {
             PreparedStatement prepareStatement = connection.prepareStatement(Query);
             prepareStatement.setInt(1, job_Id);
             int rowsAffected = prepareStatement.executeUpdate();
             if (rowsAffected > 0 ) {
                 System.out.println(rowsAffected + " record deleted");
                 return true;
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
        return false;
     }
}


