package com.vladyslavvlasov.app.classwork.lesson5;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class BiggerAreaCalculation {
    public static double calculateBigger(double area1, double area2) {
        //public static final double PI = 3.14d;

        if (area1 > area2) {
            System.out.println("Area1 is bigger");
            return area1;
        } else
            System.out.println("Area2 is bigger");
        return area2;
    }
}
