package com.vladyslavvlasov.app.classwork.lesson15;

/**
 * Created by Murcielago on 16.11.2016.
 */
public class Person {
    protected String name;
    public Person (String name){
        this.name= name;
    }
    public String getResponse(String question){
            return question;
    }
}
