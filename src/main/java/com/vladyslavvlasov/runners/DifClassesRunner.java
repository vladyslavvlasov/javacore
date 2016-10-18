package com.vladyslavvlasov.runners;

import com.vladyslavvlasov.app.classwork.lesson5.DifClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Murcielago on 15.10.2016.
 */
public class DifClassesRunner {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter Program number");
            System.out.println("Enter 1 for Triangle checker program");
            System.out.println("Enter 2 for area calculation program");
            System.out.println("Enter 3 for area comparison program");
            System.out.println("If you don't wanna play, press ENTER");
            String input = scanner.nextLine();
            if (input.length() < 1) {
                System.exit(0);
            } else {
                int number = Integer.parseInt(input);
                DifClasses.selectProgram(number);
            }
        }
    }
}
