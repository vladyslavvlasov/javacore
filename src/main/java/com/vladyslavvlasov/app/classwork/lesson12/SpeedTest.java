package com.vladyslavvlasov.app.classwork.lesson12;

/**
 * Created by Murcielago on 09.11.2016.
 */
public class SpeedTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 100000L; i++)
            c = c.concat(b);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        SpeedTest.testStringBuilder();
    }

    public static void testStringBuilder() {
        long start2 = System.currentTimeMillis();
        StringBuilder c = new StringBuilder("start");
        String b = "finish";
        for (long i = 0; i < 100000L; i++)
            c = c.append(b);
        long end = System.currentTimeMillis();
        System.out.println(end - start2);
    }
}
