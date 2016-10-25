package com.vladyslavvlasov.app.homework.lesson7;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Murcielago on 24.10.2016.
 */
public class ArrayFrom1to99 {
    public static void main(String[] args) {
        ArrayFrom1to99 newObject = new ArrayFrom1to99();
        newObject.createArray();
    }

    public void printArray(int[] anArray) {
        for (int j = 0; j < anArray.length; j++) {
            System.out.print(anArray[j] + " ");
        }
    }

    public void printArrayInReverse(int[] anArray2) {
        for (int u = 49; u >= 0; u--) {
            System.out.print(anArray2[u] + " ");
        }
    }

    public int[] createArray() {
        int[] myArray = IntStream.iterate(1, n -> n + 2).limit(50).toArray();
        ArrayFrom1to99 printObject = new ArrayFrom1to99();
        printObject.printArray(myArray);
        System.out.println(" ");
        printObject.printArrayInReverse(myArray);
        return myArray;
    }
}


