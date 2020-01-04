package edu.niptict.cs.g5.lms;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/15/2019
 **/
public class User {

    String name;
    String userName;
    String password;

    static int numberOfLogin;

    public void updateUser(User newUser) {
        this.name = newUser.name != null ? newUser.name : this.name;
        this.password = newUser.password != null ? newUser.password : this.password;
    }

    public static void increaseNumberOfLogin() {
        numberOfLogin++;
    }
}
