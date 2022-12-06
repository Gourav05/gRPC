package respository;

import  java.sql.*;

public class UserRepoImpl implements UserRepo{
    Connection connection;

    public UserRepoImpl()
    {
        try {

            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/flexworkregister","postgres", "Global@900");
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
    public boolean addUser(String userEmail, String password) {
        String Query = "INSERT INTO users (useremail,password) VALUES(?,?)";

        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);


            prepareStatement.setString(1, userEmail);

            prepareStatement.setString(2, password);;

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

//    @Override
//    public boolean addUser(String userName, String userEmail, int userId, String dob, String gender, String password, String name, long phone, String designation, String primarySkill, String secondarySkill)
//    {
//        String Query = "INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?,?,?)";
//
//        try {
//            PreparedStatement prepareStatement = connection.prepareStatement(Query);
//
//            prepareStatement.setString(1, userName);
//            prepareStatement.setString(2, userEmail);
//            prepareStatement.setInt(3, userId);
//            prepareStatement.setString(4, dob);
//            prepareStatement.setString(5, gender);
//            prepareStatement.setString(6, password);
//            prepareStatement.setString(7, name);
//            prepareStatement.setLong(8, phone);
//            prepareStatement.setString(9, designation);
//            prepareStatement.setString(10, primarySkill);
//            prepareStatement.setString(11, secondarySkill);
//            int rowsAffected = prepareStatement.executeUpdate();
//
//            if (rowsAffected > 0 ) {
//                System.out.println(rowsAffected + " record inserted");
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
    @Override
    public boolean login(String userEmail, String password) {
        boolean loginStatus=false;
        String Query="select userEmail,password from users where userEmail=? and password=?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(Query);
            prepareStatement.setString(1,userEmail);
            prepareStatement.setString(2,password);

            ResultSet rs=prepareStatement.executeQuery();
            while (rs.next())
            {
                String email=rs.getString("userEmail");
                String pass=rs.getString("password");
                if(email.equals(userEmail)&&pass.equals(password))
                {
                    System.out.println("userEmail"+userEmail+"email "+userEmail);
                    System.out.println(email.equals(userEmail)&&pass.equals(password));

                    return true;
                }
            }

        }
        catch (Exception e)
        {        }
        return loginStatus;
    }
}
