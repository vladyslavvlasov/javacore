package com.vladyslavvlasov.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by Murcielago on 29.10.2016.
 */
public class BubbleSorting {
    public static void main(String[] args) {
        int[] bubbleArray = {5, 4, 2, 1, 3};
        int i = 0;
        int j = 0;
        int temp = 0;
        do {
            j = 0;
            for (i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] > bubbleArray[i + 1]) {
                    temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = temp;
                    // System.out.println(bubbleArray[i]);
                    //  System.out.println(bubbleArray[i + 1]);
                    j = 1;
                }
            }
        }
        while (j > 0);
        System.out.println(Arrays.toString(bubbleArray));
    }

}
