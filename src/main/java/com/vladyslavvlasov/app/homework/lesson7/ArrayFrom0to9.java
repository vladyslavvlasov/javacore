package com.vladyslavvlasov.app.homework.lesson7;

import com.vladyslavvlasov.app.homework.lesson9.ArrayPrint;

import java.util.Arrays;

/**
 * Created by Murcielago on 24.10.2016.
 */
public class ArrayFrom0to9 {
    static int[] randomArray = new int[15];

    public static int[] fillRandomArrayFrom0to9() {
        int counter = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 9);
            if (randomArray[i] % 2 == 0) {
                counter++;
            }
        }
        ArrayPrint.printArrayInLine(randomArray);
        System.out.println("Your number of even numbers is " + counter);
        return randomArray;
    }
}

