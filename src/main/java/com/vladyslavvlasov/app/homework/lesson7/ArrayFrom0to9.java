package com.vladyslavvlasov.app.homework.lesson7;

/**
 * Created by Murcielago on 24.10.2016.
 */
public class ArrayFrom0to9 {
    public static void main(String[] args) {
        ArrayFrom0to9.fillArray();
    }

    public static int[] fillArray() {
        int[] randomArray = new int[15];
        int counter = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 9);
            if (randomArray[i] % 2 == 0) {
                counter++;
            }
            System.out.print(randomArray[i] + " ");
        }
        System.out.println("Your number of even numbers is " + counter);
        return randomArray;
    }
}

