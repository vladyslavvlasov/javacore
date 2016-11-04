package com.vladyslavvlasov.runners.classwork.lesson7;

import java.util.Scanner;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class NumbersWithExit {
    public static void main(String[] args) {
        NumbersWithExit.askNumbers();
    }

    public static void askNumbers() {
        int sumofnumbers = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number or type in \"Exit\"");
            String input = scanner.nextLine();
            if (input.toLowerCase().equalsIgnoreCase("exit")) {
                System.out.println("Your sum of numbers is " + sumofnumbers);
                System.exit(0);
            } else {
                int intInput = Integer.parseInt(input);
                sumofnumbers = sumofnumbers + intInput;
            }
        }
    }
}
