package org.stackroute.repository;

import java.sql.SQLException;

public interface RecommendationRepo {
    public boolean addRecommendation(String job_recommendation_title, int userId, int jobId, String job_recommendation_details) throws SQLException;
}
