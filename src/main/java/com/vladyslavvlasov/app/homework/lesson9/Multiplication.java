package com.vladyslavvlasov.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by Murcielago on 31.10.2016.
 */
public class Multiplication {
    static String[] multiTable;

    public static void main(String[] args) {
        Multiplication.createMultiplicationTable();
        System.out.println(Arrays.toString(multiTable));
        Multiplication.createTeacherArray();
    }

    public static String[] createMultiplicationTable() {
        multiTable = new String[36];
        int count = 0;
        for (int i = 2; i < 10; i++) {
            for (int j = 9; j >= i; j--) {
                multiTable[count] = Integer.toString(i) + "*" + Integer.toString(j);
                count++;
            }
        }
        // System.out.println(Arrays.toString(multiTable));
        return multiTable;
    }


    public static void createTeacherArray() {
        String[] teacherNotes = new String[15];
        int indexOfNewArray = 0;

        while (indexOfNewArray < 15) {
            String counter="";
            int indexOfTable = (int) (Math.random() * 36);
            for (int i = 0; i < teacherNotes.length -1; i++) {
                if (multiTable[indexOfTable].equals(teacherNotes[i])) {
                    indexOfNewArray=indexOfNewArray-1;
                    counter =multiTable[indexOfTable];
                    break;
                }
            }
            if (counter.equals(multiTable[indexOfTable])){
                continue;
            }
            else
           teacherNotes[indexOfNewArray] = multiTable[indexOfTable];
            indexOfNewArray++;
           // System.out.println("Task " + indexOfNewArray + teacherNotes[indexOfNewArray]);
        }
System.out.println(Arrays.toString(teacherNotes));
    }
}
// teacherNotes[i] = Multiplication.createMultiplicationTable()[(int) (Math.random() * 36)];
/*            for (int j = i+1; j< teacherNotes.length; j++) {
                if (teacherNotes[i] != teacherNotes[j]) {
                    teacherNotes[i] = Multiplication.createMultiplicationTable()[(int) (Math.random() * 36)];
                }
            }*/

//   System.out.println(Arrays.toString(teacherNotes));