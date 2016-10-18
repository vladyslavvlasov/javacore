package com.vladyslavvlasov.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class CircleArea {
    public static double calculate(double radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area is " + circleArea);
        return circleArea;
    }
}
