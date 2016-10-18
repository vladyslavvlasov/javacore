package com.vladyslavvlasov.app.classwork.lesson5;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class RightSidedTriangle {
    public static boolean rightTriangleChecker(double a, double b, double c) {
        if ((c * c == a * a + b * b) || (b * b == a * a + c * c) || (a * a == b * b + c * c)) {
            System.out.println("Right-angled");
            return true;

        } else {
            System.out.println("Not Right-angled");
            return false;
        }
    }
}
