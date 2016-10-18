package com.vladyslavvlasov.runners;

import com.vladyslavvlasov.app.classwork.lesson5.CircleArea2;

import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class CircleArea2Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter area1");
        double area1 = scanner.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter area2");
        double area2 = scanner2.nextDouble();

        CircleArea2.calculateBigger(area1, area2);
    }
}
