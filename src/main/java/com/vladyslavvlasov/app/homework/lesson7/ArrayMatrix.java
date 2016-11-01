package com.vladyslavvlasov.app.homework.lesson7;

import com.vladyslavvlasov.app.homework.lesson9.ArrayPrint;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class ArrayMatrix {
    public static int[][] createMatrixArray() {
        int[][] matrixArray = new int[8][5];
        ArrayMatrix.printMatrixArray(matrixArray);
        return matrixArray;
    }

    public static void printMatrixArray(int[][] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            int counter = 1;
            int min = 1;
            int max = 999;
            System.out.print("Line " + counter);
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j] = min + (int) (Math.random() * ((max - min) + 1));
                System.out.printf("%5d", newArr[i][j]);
            }
            System.out.println();
            counter++;
        }
    }
}