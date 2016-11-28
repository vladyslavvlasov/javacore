package com.vladyslavvlasov.app.classwork.lesson17;

/**
 * Created by Murcielago on 26.11.2016.
 */
public enum Holidays {
    NEW_YEAR("New Year", "01.01.2017", "January"), XMAS("Christmas", "07.01.2017", "January"), BDAY("Birthday", "20.04.2017", "April");
    private String name;
    private String date;
    private String month;

    private Holidays(String name, String date, String month) {
        this.name = name;
        this.date = date;
        this.month = month;
    }

    private String getName() {
        return name;
    }

    private String getDate() {
        return date;
    }

    private String getMonth() {
        return month;
    }

    public static void main(String[] args) {
        for (Holidays newH : Holidays.values()) {
            System.out.println("Holiday Name: " + newH.getName());
        }
    }
}

