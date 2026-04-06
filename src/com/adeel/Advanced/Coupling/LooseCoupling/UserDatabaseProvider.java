package com.adeel.Advanced.Coupling.LooseCoupling;

public class UserDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        // Directly access database here
        return "User details from database";
    }
}
