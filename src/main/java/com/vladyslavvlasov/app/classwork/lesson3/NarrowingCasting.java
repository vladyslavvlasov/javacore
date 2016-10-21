package com.vladyslavvlasov.app.classwork.lesson3;

/**
 * Created by Murcielago on 08.10.2016.
 */
public class NarrowingCasting {
    int int1 = 0;

    public int narrowing(float float1) {
        int1 = (int) float1;
        System.out.println(int1);
        return int1;
    }
}
