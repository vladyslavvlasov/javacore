package com.vladyslavvlasov.app.classwork.lesson12;

import java.util.Scanner;

/**
 * Created by Murcielago on 09.11.2016.
 */
public class StringSplit {
    public static void main(String[] args) {
        StringSplit.splitString();
    }

    public static void splitString() {
        System.out.println("Please words using spaces between words ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String inputString2 = inputString.replace("  ", " ").trim();
        String[] stringArr = inputString2.split(" ");
        int result = stringArr.length;
        System.out.println("Your number of words is " + result);
    }
}
