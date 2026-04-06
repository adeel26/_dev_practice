package com.adeel.Advanced.Coupling.LooseCoupling;

public class WebServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "Fetching data from webservice";
    }
}
