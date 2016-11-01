package com.vladyslavvlasov.app.classwork.lesson3;

/**
 * Created by Murcielago on 08.10.2016.
 */
public class WideningCasting {

    static short short1 = 0;
    static int int1 = 0;
    static long long1 = 0L;
    static float float1 = 0.0f;
    static double double1 = 0.0d;

    public static double wideIt(byte byte1) {
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
        return double1;
    }
}