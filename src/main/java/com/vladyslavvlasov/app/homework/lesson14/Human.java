package com.vladyslavvlasov.app.homework.lesson14;

/**
 * Created by Murcielago on 18.11.2016.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The name has been set to " + name);
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
            System.out.println("The age has been set to " + age);
        } else {
            System.out.println("Age is invalid. Age should be between 1 and 120 inclusive.");
        }
    }
}

