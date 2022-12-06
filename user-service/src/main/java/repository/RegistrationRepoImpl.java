package repository;

import org.stackroute.register.allr;
import org.stackroute.register.rs;

import java.util.*;
import java.sql.*;

public class RegistrationRepoImpl implements RegistrationRepo {


    Connection connection;

    public RegistrationRepoImpl() {
        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/flexworkregister", "postgres", "Global@900");
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
    public boolean addUser(String userName, String userEmail, int userId, String dob, String gender, String password, String name, long phone, String designation, String primarySkill, String secondarySkill) {
        String Query = "INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);

            prepareStatement.setString(1, userName);
            prepareStatement.setString(2, userEmail);
           // prepareStatement.setInt(3, userId);
            prepareStatement.setString(4, dob);
            prepareStatement.setString(5, gender);
            prepareStatement.setString(6, password);
            prepareStatement.setString(7, name);
            prepareStatement.setLong(8, phone);
            prepareStatement.setString(9, designation);
            prepareStatement.setString(10, primarySkill);
            prepareStatement.setString(11, secondarySkill);
            int rowsAffected = prepareStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " record inserted");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUser(String userEmail) {
        String Query = "DELETE FROM users WHERE userEmail = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setString(1, userEmail);
            int rowsAffected = prepareStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " record deleted");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(String userName, String userEmail, int userId, String dob, String gender, String password, String name, long phone, String designation, String primarySkill, String secondarySkill) {

        String Query = "UPDATE users SET userName = ?, userEmail = ?,dob = ? ," +
                " gender = ? ,password = ? ,name = ? ," +
                " phone = ?, designation = ?, primarySkill = ?," +
                " secondarySkill = ? WHERE userEmail = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setString(1, userName);
            prepareStatement.setString(2, userEmail);
            //prepareStatement.setInt(3, userId);
            prepareStatement.setString(3, dob);
            prepareStatement.setString(4, gender);
            prepareStatement.setString(5, password);
            prepareStatement.setString(6, name);
            prepareStatement.setLong(7, phone);
            prepareStatement.setString(8, designation);
            prepareStatement.setString(9, primarySkill);
            prepareStatement.setString(10, secondarySkill);
            prepareStatement.setString(11, userEmail);
            int rowsAffected = prepareStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " record updated");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public List<String> getUserByMail(String emailId) {
        List<String> User = new ArrayList<>();
        String Query = "SELECT * FROM users WHERE useremail = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setString(1, emailId);


            ResultSet rs = prepareStatement.executeQuery();
            if (rs.next()) {
                User.add(rs.getString("userName"));
                User.add(rs.getString("userEmail"));
                User.add(rs.getString("userId"));
                User.add(rs.getString("dob"));
                User.add(rs.getString("gender"));
                User.add(rs.getString("password"));
                User.add(rs.getString("name"));
                User.add(rs.getString("phone"));
                User.add(rs.getString("designation"));
                User.add(rs.getString("primarySkill"));
                User.add(rs.getString("secondarySkill"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return User;


    }

    @Override
    public List<rs> getUserByPrimaryskil(String primarySkill) {

        List<rs> User = new ArrayList<>();
        String Query = "SELECT * FROM users WHERE primarySkill = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setString(1, primarySkill);


//            ResultSet  resultSet= prepareStatement.getResultSet();
            ResultSet resultSet=prepareStatement.executeQuery();
            while (resultSet.next()){
                rs.Builder r=rs.newBuilder();

                r.setName(resultSet.getString("userName"));
               // System.out.println("USER" +(resultSet.getString("userName")));
                r.setUserEmail(resultSet.getString("userEmail"));
                r.setUserId(resultSet.getInt("userId"));
                r.setDob(resultSet.getString("dob"));
                r.setGender(resultSet.getString("gender"));
                r.setPassword(resultSet.getString("password"));
                r.setName(resultSet.getString("name"));
                r.setPhone(resultSet.getLong("phone"));
                r.setDesignation(resultSet.getString("designation"));
                r.setPrimarySkil(resultSet.getString("primarySkill"));
                r.setSecondarySkill(resultSet.getString("secondarySkill"));
                User.add(r.build());
            }




//            ResultSet rss = prepareStatement.executeQuery();
//            if (rss.next()) {
//                org.stackroute.register.rs.Builder r= org.stackroute.register.rs.newBuilder();
//                r.setName(rss.getString("userName"));
//                r.setUserEmail(rss.getString("userEmail"));
//                r.setUserId(rss.getInt("userId"));
//                r.setDob(rss.getString("dob"));
//                r.setGender(rss.getString("gender"));
//                r.setPassword(rss.getString("password"));
//                r.setName(rss.getString("name"));
//                r.setPhone(rss.getLong("phone"));
//                r.setDesignation(rss.getString("designation"));
//                r.setPrimarySkil(rss.getString("primarySkill"));
//                r.setSecondarySkill(rss.getString("secondarySkill"));
//                User.add(r.build());
//
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return User;
    }

    @Override
    public List<String> getUserBySecondaryskill(String secondarySkill) {
        List<String> User = new ArrayList<>();
        String Query = "SELECT * FROM users WHERE secondarySkill = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setString(1, secondarySkill);


            ResultSet rs = prepareStatement.executeQuery();
            if (rs.next()) {
                User.add(rs.getString("userName"));
                User.add(rs.getString("userEmail"));
                User.add(rs.getString("userId"));
                User.add(rs.getString("dob"));
                User.add(rs.getString("gender"));
                User.add(rs.getString("password"));
                User.add(rs.getString("name"));
                User.add(rs.getString("phone"));
                User.add(rs.getString("designation"));
                User.add(rs.getString("primarySkill"));
                User.add(rs.getString("secondarySkill"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return User;
    }

    @Override
    public List<String> getUserByUserID(int userID) {
        List<String> User = new ArrayList<>();
        String Query = "SELECT * FROM users WHERE userID = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setInt(1, userID);


            ResultSet rs = prepareStatement.executeQuery();
            if (rs.next()) {
                User.add(rs.getString("userName"));
                User.add(rs.getString("userEmail"));
                User.add(rs.getString("userId"));
                User.add(rs.getString("dob"));
                User.add(rs.getString("gender"));
                User.add(rs.getString("password"));
                User.add(rs.getString("name"));
                User.add(rs.getString("phone"));
                User.add(rs.getString("designation"));
                User.add(rs.getString("primarySkill"));
                User.add(rs.getString("secondarySkill"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return User;
    }

    @Override
    public List<String> getUserByDesignation(String designation) {
        List<String> User = new ArrayList<>();
        String Query = "SELECT * FROM users WHERE designation = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setString(1, designation);


            ResultSet rs = prepareStatement.executeQuery();
            if (rs.next()) {
                User.add(rs.getString("userName"));
                User.add(rs.getString("userEmail"));
                User.add(rs.getString("userId"));
                User.add(rs.getString("dob"));
                User.add(rs.getString("gender"));
                User.add(rs.getString("password"));
                User.add(rs.getString("name"));
                User.add(rs.getString("phone"));
                User.add(rs.getString("designation"));
                User.add(rs.getString("primarySkill"));
                User.add(rs.getString("secondarySkill"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return User;
    }

    @Override
    public List<Integer> getUserId() {
        List<Integer> userId = new ArrayList<>();

        String query = "select userid from users";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(query);


            ResultSet rs = prepareStatement.executeQuery();

           while(rs.next()==true) {

                   userId.add(rs.getInt("userid"));

           }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userId;
    }

    @Override
    public List<allr> getByString(String keywords) throws SQLException {
        List<allr> User = new ArrayList<>();
        String query= "select * from users where POSITION(primaryskill IN ? ) > 0 " +
                "or Position(useremail in ? ) > 0;" ;
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(query);
             prepareStatement.setString(1, keywords);
            prepareStatement.setString(2, keywords);


//            ResultSet  resultSet= prepareStatement.getResultSet();
        ResultSet resultSet=prepareStatement.executeQuery();
        while (resultSet.next()){
            allr.Builder r=allr.newBuilder();

            r.setName(resultSet.getString("userName"));
            //System.out.println("USER" +(resultSet.getString("userName")));
            r.setUserEmail(resultSet.getString("userEmail"));
            r.setUserId(resultSet.getInt("userId"));
            r.setDob(resultSet.getString("dob"));
            r.setGender(resultSet.getString("gender"));
            r.setPassword(resultSet.getString("password"));
            r.setName(resultSet.getString("name"));
            r.setPhone(resultSet.getLong("phone"));
            r.setDesignation(resultSet.getString("designation"));
            r.setPrimarySkil(resultSet.getString("primarySkill"));
            r.setSecondarySkill(resultSet.getString("secondarySkill"));
            User.add(r.build());
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

        return User;
}
}