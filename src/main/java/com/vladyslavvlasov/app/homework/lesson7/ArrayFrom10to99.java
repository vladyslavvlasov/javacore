package com.vladyslavvlasov.app.homework.lesson7;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class ArrayFrom10to99 {
    public static void main(String[] args) {
        ArrayFrom10to99.fillArray();
    }

    public static int[][] fillArray() {
        int[][] doubleArray = new int[8][5];
        int min = 10;
        int max = 99;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = min + (int) (Math.random() * ((max - min) + 1));
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
        return doubleArray;
    }
}
