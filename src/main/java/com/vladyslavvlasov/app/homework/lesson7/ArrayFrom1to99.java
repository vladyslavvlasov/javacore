package com.vladyslavvlasov.app.homework.lesson7;

import com.vladyslavvlasov.app.homework.lesson9.ArrayPrint;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Murcielago on 24.10.2016.
 */
public class ArrayFrom1to99 {
    public static int [] createArrayFrom1to99() {
        int[] myArray = IntStream.iterate(1, n -> n + 2).limit(50).toArray();
        return myArray;
    }
}





