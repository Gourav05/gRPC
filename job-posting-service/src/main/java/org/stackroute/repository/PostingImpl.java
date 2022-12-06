package org.stackroute.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostingImpl implements Posting{

    Connection con;
    {
        try {
            con = Database.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addPostInDatabase(int jobId, String jobTitle, String jobLocation, int experience, String qualification, int noticePeriod, String jobDescription,String postedDate, int postedBy) throws SQLException {
        String query = "insert into jobposting values (?,?,?,?,?,?,?,?,?)";

        try {

            if (con != null) {
                System.out.println("Database has been connect !!");
            }

            assert con != null;
            PreparedStatement st = con.prepareStatement(query);

            st.setInt(1, jobId);
            st.setString(2, jobTitle);
            st.setString(3, jobLocation);
            st.setInt(4, experience);
            st.setString(5, qualification);
            st.setInt(6, noticePeriod);
            st.setString(7, jobDescription);
            st.setString(8, postedDate);
            st.setInt(9, postedBy);

            int count = st.executeUpdate();

        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

    @Override
    public int updatePostInDatabase(String jobTitle, String jobLocation, int experience, String qualification, int noticePeriod, String jobDescription, String postedDate, int postedBy, int jobId) throws SQLException {

            if (con != null) {
                System.out.println("Database has been connect !!");
            }
            String query = "UPDATE jobposting "
                    + "SET jobTitle = ? "
                    + ", jobLocation = ?"
                    + ", experience = ?"
                    + ", qualification = ?"
                    + ", noticePeriod = ?"
                    + ", jobDescription = ?"
                    + ", postedDate = ?"
                    + "WHERE postedBy = ? and jobId = ?";

            assert con != null;
            PreparedStatement st = con.prepareStatement(query);

            st.setString(1, jobTitle);
            st.setString(2, jobLocation);
            st.setInt(3, experience);
            st.setString(4, qualification);
            st.setInt(5, noticePeriod);
            st.setString(6, jobDescription);
            st.setString(7, postedDate);
            st.setInt(8,postedBy);
            st.setInt(9, jobId);

            int count = st.executeUpdate();
            System.out.println(count);

        return count;
    }

    @Override
    public int deletePostFromDatabase(int jobId, int postedBy) throws SQLException {

            if (con != null) {
                System.out.println("Database has been connect !!");
            }
            String query = "delete from jobposting "
                    + "WHERE jobId = ? and postedBy = ?";

            assert con != null;
            PreparedStatement st = con.prepareStatement(query);

            st.setInt(1, jobId);
            st.setInt(2, postedBy);

            int count = st.executeUpdate();

        return count;
    }

    @Override
    public List<String> getJobByTitle(String jobTitle) {
        List<String> jobs= new ArrayList<>();
        String Query = "SELECT * FROM jobposting WHERE jobTitle = ?";
        try {
            PreparedStatement prepareStatement = con.prepareStatement(Query);
            prepareStatement.setString(1, jobTitle);


            ResultSet rs = prepareStatement.executeQuery();
            if(rs.next()) {
                jobs.add(rs.getString("jobTitle"));
                jobs.add(rs.getString("jobLocation"));
                jobs.add(String.valueOf(rs.getInt("experience")));
                jobs.add(rs.getString("qualification"));
                jobs.add(String.valueOf(rs.getInt("noticePeriod")));
                jobs.add(rs.getString("jobDescription"));
                jobs.add(rs.getString("postedDate"));
                jobs.add(String.valueOf(rs.getInt("postedBy")));
                jobs.add(String.valueOf(rs.getInt("jobId")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return jobs;
    }

    @Override
    public List<Integer> getAllJobId() {
        List<Integer> jobIdList = new ArrayList<>();

        String query = "select jobId from jobposting";
        try {
            PreparedStatement prepareStatement = con.prepareStatement(query);


            ResultSet rs = prepareStatement.executeQuery();

            while(rs.next()) {

                jobIdList.add(rs.getInt("jobId"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobIdList;
    }
}
