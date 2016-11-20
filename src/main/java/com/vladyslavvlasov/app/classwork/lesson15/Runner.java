package com.vladyslavvlasov.app.classwork.lesson15;

import com.vladyslavvlasov.app.classwork.lesson15.Person;
import com.vladyslavvlasov.app.classwork.lesson15.Student;
import com.vladyslavvlasov.app.classwork.lesson15.Teacher;

/**
 * Created by Murcielago on 19.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Person pers;
        pers = new Teacher("John", "Kit Center");
        System.out.println(pers.getResponse("Teacher question"));


        Student newStud = new Student("Vova", "Kit Center");
        System.out.println("Student question");
    }
}
