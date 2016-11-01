package com.vladyslavvlasov.runners.homework.lesson4;

import com.vladyslavvlasov.app.homework.lesson4.ArrayApp;

import java.util.Scanner;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class ArrayAppRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of klych");
        System.out.println("1.Slava Ukraini");
        System.out.println("2.Slava Nazii");
        System.out.println("3.Ukraina");
        int number = scanner.nextInt();
        ArrayApp newArr = new ArrayApp();
        newArr.returnKlych(number - 1);
    }
}
