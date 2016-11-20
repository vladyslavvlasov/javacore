package com.vladyslavvlasov.app.homework.lesson15;

import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

import java.util.Arrays;

/**
 * Created by Murcielago on 20.11.2016.
 */
public class RandomArrayParametrized extends RandomArrayCreator {

    public RandomArrayParametrized(int a) {
        this.a = a;
    }

    public RandomArrayParametrized(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int[] create(int a) {
        this.singleArray = new int[a];
        for (int i = 0; i < singleArray.length; i++) {
            singleArray[i] = (int) (Math.random() * 100);
        }
        ArrayPrint.printArrayInLine(singleArray);
        return singleArray;
    }

    @Override
    public int[][] create(int a, int b) {
        if (a > 0 && b > 0) {
            this.doubleArray = new int[a][b];
            for (int i = 0; i < doubleArray.length; i++) {
                for (int j = 0; j < doubleArray[i].length; j++) {
                    doubleArray[i][j] = (int) (Math.random() * 100);
                }
            }
            ArrayPrint.printDoubleRandomArray(doubleArray);
            return doubleArray;
        } else {
            System.out.println("Your input was wrong. Array is set to null");
            return null;
        }
    }
}

