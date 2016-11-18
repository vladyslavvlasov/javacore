package com.vladyslavvlasov.app.homework.lesson14;

/**
 * Created by Murcielago on 18.11.2016.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = setAge(age);
    }

    public Human() {
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String setName(String name) {
        System.out.println("The name has been set to " + name);
        this.name = name;
        return name;
    }

    public int setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
            System.out.println("The age has been set to " + age);
        } else {
            System.out.println("Age is invalid. Age should be between 1 and 120 inclusive.");
        }
        return this.age;
    }
}

