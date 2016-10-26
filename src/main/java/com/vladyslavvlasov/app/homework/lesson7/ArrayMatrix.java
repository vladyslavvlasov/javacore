package com.vladyslavvlasov.app.homework.lesson7;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class ArrayMatrix {
    public static void main(String[] args) {
        ArrayMatrix.printArray();
    }

    public static void printArray() {
        int[][] matrixArray = new int[8][5];
        int counter = 1;
        for (int i = 0; i < matrixArray.length; i++) {
            int min = 1;
            int max = 999;
            System.out.print("Line " + counter);
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = min + (int) (Math.random() * ((max - min) + 1));
                System.out.printf("%5d", matrixArray[i][j]);
            }
            System.out.println();
            counter++;
        }
    }
}