package com.vladyslavvlasov.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by Murcielago on 01.11.2016.
 */
public class ArrayFromNegative99to99 {
    public static int[][] createArrayFromNegative99to99() {
        int[][] bigArray = new int[5][8];
        int biggestnum = 0;
        for (int i = 0; i < bigArray.length; i++) {
            biggestnum = 0;
            int min = -99;
            int max = 99;
            for (int j = 0; j < bigArray[i].length; j++) {
                bigArray[i][j] = (int) (Math.random() * ((max - min) + 1));
                System.out.print(bigArray[i][j] + " ");
                if (biggestnum < bigArray[i][j]) {
                    biggestnum = bigArray[i][j];
                }
            }
            System.out.println("Biggest number is " + biggestnum);
            System.out.println();
        }
        return bigArray;
    }
}
