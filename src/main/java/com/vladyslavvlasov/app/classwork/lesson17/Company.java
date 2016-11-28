package com.vladyslavvlasov.app.classwork.lesson17;

/**
 * Created by Murcielago on 26.11.2016.
 */
public enum Company {
    EBAY(30, "Ebay INC") {
        @Override
        int getRevenue() {
            return 100;
        }
    }, GOOGLE(15, "Google Inc") {
        @Override
        int getRevenue() {
            return 6757;
        }
    };
    private int value;
    private String fullName;

    abstract int getRevenue();

    private Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        for (Company cName : Company.values()) {
            System.out.println("Company Value: " + cName.getValue() + " -Company Name: " + cName);
        }
    }
}
