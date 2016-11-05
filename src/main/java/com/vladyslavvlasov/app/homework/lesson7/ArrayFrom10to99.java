package com.vladyslavvlasov.app.homework.lesson7;

import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class ArrayFrom10to99 {
    public static int[][] fillArray() {
        int[][] doubleArray = new int[8][5];
        ArrayPrint.printDoubleRandomArrayWithMinMax(doubleArray,10,99);
        return doubleArray;
    }
}
