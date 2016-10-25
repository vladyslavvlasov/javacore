package com.vladyslavvlasov.app.homework.lesson7;

/**
 * Created by Murcielago on 24.10.2016.
 */
public class ArrayFrom2to20 {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int j = 0; j < intArray.length; j++) {
            System.out.print(intArray[j] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
