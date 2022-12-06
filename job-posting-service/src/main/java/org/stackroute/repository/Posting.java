package org.stackroute.repository;

import java.sql.SQLException;
import java.util.List;

public interface Posting {
    void addPostInDatabase(int jobId, String jobTitle, String jobLocation, int experience, String qualification, int noticePeriod, String jobDescription,String postedDate, int postedBy) throws SQLException;

    int updatePostInDatabase(String jobTitle, String jobLocation, int experience, String qualification, int noticePeriod, String jobDescription, String postedDate, int postedBy, int jobId) throws SQLException;

    int deletePostFromDatabase(int jobId, int postedBy) throws SQLException;

    List<String> getJobByTitle(String jobTitle);

    List<Integer> getAllJobId();

}
