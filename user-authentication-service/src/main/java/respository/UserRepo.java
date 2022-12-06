package respository;

public interface UserRepo {

    public boolean addUser(String userEmail,String password);
    public boolean login(String userEmail, String password);
}
