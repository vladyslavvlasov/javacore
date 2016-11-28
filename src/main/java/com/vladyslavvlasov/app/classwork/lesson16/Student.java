package com.vladyslavvlasov.app.classwork.lesson16;

/**
 * Created by Murcielago on 23.11.2016.
 */
public class Student extends Person {
    private String university;
    public Student(String name, String university){
        super(name);
        this.university= university;
    }
    @Override
    public String getResponse(String question){
        return "Ehh, what was the question?";
    }
}
