package com.vladyslavvlasov.app.classwork.lesson14;

/**
 * Created by Murcielago on 16.11.2016.
 */
public class Student extends Person {
    private String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getResponse(String question) {
        return "Ehh, what was the question?";
    }

    public void getUni() {
        System.out.println(this.name + " is from " + this.university);
    }

    public String setUniversity(String uni) {
        this.university = uni;
        return uni;
    }
}
