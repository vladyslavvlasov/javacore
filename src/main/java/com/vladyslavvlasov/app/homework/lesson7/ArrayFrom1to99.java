package com.vladyslavvlasov.app.homework.lesson7;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Murcielago on 24.10.2016.
 */
public class ArrayFrom1to99 {
    public static void main(String[] args) {
        ArrayFrom1to99.createArray();
    }

    public static void createArray() {
        int[] myArray = IntStream.iterate(1, n -> n + 2).limit(50).toArray();
        ArrayFrom1to99 printObject = new ArrayFrom1to99();
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + " ");
        }
        System.out.println(" ");
        for (int u = 49; u >= 0; u--) {
            System.out.print(myArray[u] + " ");
        }
    }
}





