package com.vladyslavvlasov.runners.homework.lesson10;

import com.vladyslavvlasov.app.classwork.lesson10.Palindrome;

import java.util.Scanner;

/**
 * Created by Murcielago on 03.11.2016.
 */
public class PalindromeRunner {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello, Leonid. Please choose one out of 4 palindrome methods. Program will ouput true if the number is a palindrome and false if not:");
            System.out.println("To choose method #1.Please type in 1");
            System.out.println("To choose method #2.Please type in 2");
            System.out.println("To choose method #3.Please type in 3");
            System.out.println("To choose method #4.Please type in 4");
            System.out.println("To exit the program, please type in \"exit\"");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                int inputNumber = Integer.valueOf(input);
                PalindromeRunner.runPalindromeCheckers(inputNumber);
            }
        }
    }

    public static void runPalindromeCheckers(int input) {
        String pal = "kayak";
        switch (input) {
            case 1:
                Palindrome.checkIfPalindrome1(pal);
                System.out.println();
                break;
            case 2:
                Palindrome.checkIfPalindrome2(pal);
                System.out.println();
                break;
            case 3:
                Palindrome.checkIfPalindrome3(pal);
                System.out.println();
                break;
            case 4:
                Palindrome.checkIfPalindrome4(pal);
                System.out.println();
                break;
            default:
                System.out.println("It looks the entered number is not 1,2,3 or 4. Please enter a valid number");
                System.out.println();
        }
    }
}
