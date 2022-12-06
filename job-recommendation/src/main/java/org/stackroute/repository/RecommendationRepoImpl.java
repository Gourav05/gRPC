package org.stackroute.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RecommendationRepoImpl implements RecommendationRepo{
    Connection connection;
    public RecommendationRepoImpl()
    {
        try {

            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/flexworkregister","postgres", "Global@900");
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
    public boolean addRecommendation(String job_recommendation_title, int userId, int jobId, String job_recommendation_details) throws SQLException {
        String query = "Insert into recommendation  (user_id, job_id, job_recommendation_title, job_recommendation_details) values(?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, userId);
        statement.setInt(2, jobId);
        statement.setString(3, job_recommendation_title);
        statement.setString(4, job_recommendation_details);
        statement.executeUpdate();
        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println(rowsAffected + " record inserted");
            return true;
        }
        return false;
    }
}
