package repository;

import org.stackroute.register.allr;
import org.stackroute.register.rs;

import java.sql.SQLException;
import java.util.List;

public interface RegistrationRepo {

	public boolean addUser(String userName,String userEmail,int userId,String dob,String gender,String password,String name,long phone,String designation,String primarySkill,String secondarySkill);
	public boolean deleteUser(String userEmail );
	public boolean updateUser(String userName,String userEmail,int userId,String dob,String gender,String password,String name,long phone,String designation,String primarySkill,String secondarySkill);

	public List<String> getUserByMail(String emailId);
	public List<rs> getUserByPrimaryskil(String primarySkill);

	public List<String> getUserBySecondaryskill(String secondarySkill);
	public List<String> getUserByUserID(int userID);

	public List<String> getUserByDesignation(String designation);

    public List<Integer> getUserId();

	public List<allr> getByString(String keywords) throws SQLException;
 /*
  Primaryskil
  secondaryskill'
  userID
  getBydesignation

  */
}

