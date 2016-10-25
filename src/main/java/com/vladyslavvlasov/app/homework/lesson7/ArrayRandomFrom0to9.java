package com.vladyslavvlasov.app.homework.lesson7;

import java.util.Arrays;

/**
 * Created by Murcielago on 24.10.2016.
 */
public class ArrayRandomFrom0to9 {
    public static void main(String[] args) {
        int[] randomArray = new int[15];
        ArrayRandomFrom0to9 newArr = new ArrayRandomFrom0to9();
        newArr.fillArray(randomArray);
    }
    public int[] fillArray(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9);
            if (arr[i] % 2 == 0) {
                counter++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("Your number of even numbers is " + counter);
        return arr;
    }
}

