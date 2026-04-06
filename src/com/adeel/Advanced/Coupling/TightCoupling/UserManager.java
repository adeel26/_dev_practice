package com.adeel.Advanced.Coupling.TightCoupling;

public class UserManager {

    UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }
}
