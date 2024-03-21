package bioskop_123220191;

public class User{
    
    private String username,password;
    
    public User(String newU, String newP){
        username =  newU;
        password = newP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}