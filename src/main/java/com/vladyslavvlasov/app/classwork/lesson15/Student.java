package com.vladyslavvlasov.app.classwork.lesson15;

/**
 * Created by Murcielago on 16.11.2016.
 */

public class Student extends Person implements Human {
    String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question) {
        return "Ehhh, what was the question?";
    }

    public String getName() {
        System.out.println("The name will be set to "+ super.name);
        return super.name;
    }
}
