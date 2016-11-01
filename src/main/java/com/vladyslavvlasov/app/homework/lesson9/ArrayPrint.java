package com.vladyslavvlasov.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by Murcielago on 30.10.2016.
 */
public class ArrayPrint {
    public static void printArraytoString(int [] newArr){
        System.out.println(Arrays.toString(newArr));
    }
    public static void printArrayInLine(int [] newArr){
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayInLineBackwords(int[] newArr){
        for (int u = 49; u >= 0; u--) {
            System.out.print(newArr[u] + " ");
        }
    }
    public static void printArrayInColumn(int [] newArr){
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static void printDoubleRandomArrayWithMinMax (int[][] newArr, int min, int max){
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = min + (int) (Math.random() * ((max - min) + 1));
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
