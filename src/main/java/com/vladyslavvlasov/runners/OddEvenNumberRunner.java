package com.vladyslavvlasov.runners;

import com.vladyslavvlasov.app.classwork.lesson5.OddEvenNumber;

import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class OddEvenNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        OddEvenNumber.isOdd(number);
    }
}
