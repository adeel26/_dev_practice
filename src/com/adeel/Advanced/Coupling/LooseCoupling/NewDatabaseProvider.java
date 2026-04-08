package com.adeel.Advanced.Coupling.LooseCoupling;

public class NewDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "New Database";
    }
}
