package GroupProject17;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        this.setEmail(email);
        this.setUserName(userName);
        this.setPassword(password);
    }

    public Registration() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@yahoo")){
            this.email = email;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(!userName.isEmpty()&&(userName.length()>6)) {
            this.userName = userName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!password.isEmpty()&&password.length()>6&&!password.equals(userName)) {
            this.password = password;
        }
    }
}
