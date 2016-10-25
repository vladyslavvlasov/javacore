package com.vladyslavvlasov.app.homework.lesson7;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class ArrayFrom0to999 {
    public static void main(String[] args) {
        ArrayFrom0to999.createArray();
    }

    public static void createArray() {
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
            System.out.print(newArr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Your max number is " + max);
        System.out.println("Your min number is " + min);
    }
}

