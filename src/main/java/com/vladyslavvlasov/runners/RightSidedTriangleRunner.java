package com.vladyslavvlasov.runners;

import com.vladyslavvlasov.app.classwork.lesson5.RightSidedTriangle;

import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class RightSidedTriangleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side of triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        RightSidedTriangle.rightTriangleChecker(a, b, c);
    }
}
