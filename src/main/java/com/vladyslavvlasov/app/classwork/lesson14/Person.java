package com.vladyslavvlasov.app.classwork.lesson14;

/**
 * Created by Murcielago on 16.11.2016.
 */
public class Person {
    private String lala;
    protected String name;
    protected int age;

    public Person(String name) {
        this.name = name;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public void getAge() {
        System.out.println(this.name + " is " + this.age);
    }
}
