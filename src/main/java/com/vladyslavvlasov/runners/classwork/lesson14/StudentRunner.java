package com.vladyslavvlasov.runners.classwork.lesson14;

import com.vladyslavvlasov.app.classwork.lesson14.Student;

/**
 * Created by Murcielago on 16.11.2016.
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student newStud = new Student("Jack", "Stanford");
        newStud.setAge(25);
        newStud.setUniversity("Cambridge");
        newStud.getUni();
        newStud.getAge();
    }
}
