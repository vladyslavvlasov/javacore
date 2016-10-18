package com.vladyslavvlasov.app.classwork.lesson5;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class OddEvenNumber {
    public static boolean isOdd(int number) {
        if (number == 0) {
            System.out.println("Your number is 0. Enter another number");
            return false;
        } else if (number % 2 == 0) {
            System.out.println("Number is even");
            return true;
        } else {
            System.out.println("Number is odd");
            return true;
        }

    }
}
