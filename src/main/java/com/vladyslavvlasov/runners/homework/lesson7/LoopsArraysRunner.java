package com.vladyslavvlasov.runners.homework.lesson7;

import com.vladyslavvlasov.app.homework.lesson7.*;

import java.util.Scanner;

/**
 * Created by Murcielago on 25.10.2016.
 */
public class LoopsArraysRunner {
    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("Hey ya! Please choose one of the following array programs:");
            System.out.println("1.Array from 2 to 20");
            System.out.println("2.Array from 1 to 99");
            System.out.println("3.Array from 0 to 9");
            System.out.println("4.Array from 0 to 999");
            System.out.println("5.Array from 10 to 99");
            System.out.println("6.Array Matrix");
            System.out.println("7.Numbers with Exit");
            System.out.println("If you want to exit type in bye");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("bye")) {
                System.exit(0);
            } else {
                int number = Integer.parseInt(input);
                LoopsArraysRunner.runProgram(number);
            }
        }
    }

    public static void runProgram(int anynumber) {
        if (anynumber == 1) {
            ArrayFrom2to20.printArrayFrom2to20();
        } else if (anynumber == 2) {
            ArrayFrom1to99.createArray();
        } else if (anynumber == 3) {
            ArrayFrom0to9.fillArray();
        } else if (anynumber == 4) {
            ArrayFrom0to999.createArray();
        } else if (anynumber == 5) {
            ArrayFrom10to99.fillArray();
        } else if (anynumber == 6) {
            ArrayMatrix.printArray();
        } else if (anynumber == 7) {
            NumbersWithExit.askNumbers();
        } else
            System.out.println("Ooops, number is incorrect. Please choose 1,2,3,4,5 or type in bye");
    }
}
