package com.vladyslavvlasov.app.classwork.lesson3;

/**
 * Created by Murcielago on 08.10.2016.
 */
public class WideningCasting {
    static byte byte1 = 127;
    static short short1 = 0;
    static int int1 = 0;
    static long long1 = 0L;
    static float float1 = 0.0f;
    static double double1 = 0.0d;

    //correct conversion 64f<=32f<=64<=32<=16<=8
    public static double wideIt() {
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
        return double1;
    }
}