package com.vladyslavvlasov.app.homework.lesson7;

import com.vladyslavvlasov.runners.homework.Lesson9.ArrayPrint;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class ArrayFrom0to999 {
    public static int [] createArrayFrom0to999() {
        int[] newArr = new int[15];
        int max = 0;
        int min = 999;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (int) (Math.random() * 999);
            if (max < newArr[i]) {
                max = newArr[i];
            }
            if (min > newArr[i]) {
                min = newArr[i];
            }
        }
        ArrayPrint.printArrayInLine(newArr);
        System.out.println("Your max number is " + max);
        System.out.println("Your min number is " + min);
        return newArr;
    }
}

