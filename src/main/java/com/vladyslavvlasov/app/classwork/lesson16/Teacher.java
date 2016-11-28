package com.vladyslavvlasov.app.classwork.lesson16;

/**
 * Created by Murcielago on 23.11.2016.
 */
public class Teacher extends Person {
    private String university;
    public Teacher(String name, String university){
        super(name);
        this.university = university;
    }
    public String lessonFinished(){
        return "Do not forget to do homework!";
    }

    public static void main(String[] args) {
        Student student = new Student("Egor","Kit Center");
        System.out.println(student.getResponse("What is class?"));

        Teacher teacher = new Teacher("Ivan", "Kit Center");
        System.out.println(teacher.getResponse("What time is now?"));

        Person person = new Student("Ilya", "Kit Center");
        System.out.println(person.getResponse("What is the class?"));

        person = new Teacher("Evheniy", "kit center");
        System.out.println(person.getResponse("What time is now?"));
    }
}
