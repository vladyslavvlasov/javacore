package com.vladyslavvlasov.app.classwork.lesson5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class CircleArea {
    public static double calculate(double radius) {

        double myPI = 3.14159;
        double circleArea = myPI * radius * radius;
        System.out.println("Area is " + circleArea);
        return circleArea;
    }
}
