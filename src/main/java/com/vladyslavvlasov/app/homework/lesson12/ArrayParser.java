package com.vladyslavvlasov.app.homework.lesson12;

import com.vladyslavvlasov.app.homework.lesson9.BubbleAndSelectionSorting;
import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

/**
 * Created by Murcielago on 10.11.2016.
 */
public class ArrayParser {

    public static int[] createIntArr(String s, String delimiter) {
        s = s.replaceAll(" ", "");
        String[] splittedStr = s.split(delimiter);
        int[] intArr = new int[splittedStr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(splittedStr[i]);
        }
        return intArr;
    }

    public static double[] createDoubleArr(String s, String delimiter) {
        s = s.replaceAll(" ", "");
        String[] splittedStr = s.split(delimiter);
        double[] doubleArr = new double[splittedStr.length];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Double.parseDouble(splittedStr[i]);
        }
        return doubleArr;
    }
}
