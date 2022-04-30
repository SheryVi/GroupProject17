package GroupProject17;

public class Task4 {
    /*
    Create Registration Class in which you would have
variables as email, userName and password that
have an access scope only within its own class. After
creating an object of the class user should be able to
call methods and in each method separately pass
values to set users email, username and password.
Requirements:
A.Valid email consider to be only yahoo
B.Valid userName and password cannot be empty and
should be of length larger than 6 characters. Also
valid password cannot contain userName

     */
    public static void main(String[] args) {
        Registration obj = new Registration("person@yahoo.ru", "persone","parolee");
        System.out.println(obj.getEmail());
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());
    }

}
