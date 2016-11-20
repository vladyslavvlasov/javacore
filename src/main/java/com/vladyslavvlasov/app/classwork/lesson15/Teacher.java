package com.vladyslavvlasov.app.classwork.lesson15;

/**
 * Created by Murcielago on 19.11.2016.
 */
public class Teacher extends Person implements Human {
    private String university;
    private String response;

    public Teacher(String name, String university) {
        super(name);
        this.university = university;
    }

    public void printOnTable() {
        System.out.println("Assume this is a table )):" + response);
    }

    @Override
    public String getName() {
        return super.name;
    }
}
