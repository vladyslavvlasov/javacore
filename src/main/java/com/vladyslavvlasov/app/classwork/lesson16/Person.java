package com.vladyslavvlasov.app.classwork.lesson16;

/**
 * Created by Murcielago on 23.11.2016.
 */
public class Person {
    protected String name;
    public Person(String name){
        this.name = name;
    }
    public String getResponse(String question){
        return "My answer is " + question;
    }
}
