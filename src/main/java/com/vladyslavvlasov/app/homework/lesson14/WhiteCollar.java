package com.vladyslavvlasov.app.homework.lesson14;

/**
 * Created by Murcielago on 18.11.2016.
 */
public class WhiteCollar extends Human {
    private String companyName;

    public WhiteCollar(int age, String name, String companyName) {
       super(name,age);
        setCompany(companyName);
    }

    public void setCompany(String company) {
        if (company.matches("^[a-zA-Z0-9_ ,-]*$")) {
            this.companyName = company;
            System.out.println("Company name has been set to " + company);
        } else {
            System.out.println("Company name is invalid");
        }
    }

    public String getCompanyName() {
        return companyName;
    }
}
