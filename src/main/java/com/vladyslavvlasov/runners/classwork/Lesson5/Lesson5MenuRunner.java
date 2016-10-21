package com.vladyslavvlasov.runners.classwork.Lesson5;

import com.vladyslavvlasov.app.classwork.lesson5.CircleArea;
import com.vladyslavvlasov.app.classwork.lesson5.BiggerAreaCalculation;
import com.vladyslavvlasov.app.classwork.lesson5.OddEvenNumber;
import com.vladyslavvlasov.app.classwork.lesson5.RightSidedTriangle;

import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class Lesson5MenuRunner {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Program number");
            System.out.println("Enter 1 for Triangle checker program");
            System.out.println("Enter 2 for area calculation program");
            System.out.println("Enter 3 for area comparison program");
            System.out.println("Enter 4 for odd/even number program");
            System.out.println("If you don't wanna play, press ENTER");
            String input = scanner.nextLine();
            if (input.length() < 1) {
                System.exit(0);
            } else {
                int number = Integer.parseInt(input);
                Lesson5MenuRunner.selectProgram(number);
            }
        }
    }
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
            BiggerAreaCalculation.calculateBigger(area1, area2);
        }
        else if (num == 4){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number");
            int number = scanner.nextInt();
            OddEvenNumber.isOdd(number);
        }
        else {
            System.out.println("Error message.Number is incorrect.Enter 1,2,3 or 4");
        }
    }
}
