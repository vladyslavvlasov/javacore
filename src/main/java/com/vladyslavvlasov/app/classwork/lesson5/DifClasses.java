package com.vladyslavvlasov.app.classwork.lesson5;

import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class DifClasses {
    public static void selectProgram(int num) {
        if (num == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a side of triangle № 1:");
            double a = scanner.nextDouble();
            System.out.println("Enter a side of triangle № 2:");
            double b = scanner.nextDouble();
            System.out.println("Enter a side of triangle № 3:");
            double c = scanner.nextDouble();
            RightSidedTriangle.rightTriangleChecker(a, b, c);
        } else if (num == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter radius to calculate area");
            double radius = scanner.nextDouble();
            CircleArea.calculate(radius);
        } else if (num == 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You will enter two areas for comparison.Please enter area 1");
            double area1 = scanner.nextDouble();
            System.out.println("Please enter area 2");
            double area2 = scanner.nextDouble();
            CircleArea2.calculateBigger(area1, area2);
        } else {
            System.out.println("Error message.Number is incorrect.Enter 1,2 or 3");
        }
    }
}
