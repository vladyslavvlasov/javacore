package com.vladyslavvlasov.runners.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson9.ArrayPrint;
import com.vladyslavvlasov.app.homework.lesson9.BubbleAndSelectionSorting;

import java.util.Scanner;

/**
 * Created by Murcielago on 01.11.2016.
 */
public class BubbleAndSelectionSortingRunner {
    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("Hello!Please choose one of two BubbleSort methods by typing a number:");
            System.out.println("1.Sort from Smaller to Bigger");
            System.out.println("2.Sort from Bigger to Smaller");
            System.out.println("3.Sort from Smaller to Bigger using Selection Sort");
            System.out.println("Type in \"Exit\" to finish");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                int number = Integer.parseInt(input);
                BubbleAndSelectionSortingRunner.runChosenProgram(number);
            }
        }

    }

    public static void runChosenProgram(int chosenNumber) {
        switch (chosenNumber) {
            case 1:
                ArrayPrint.printArrayInLine(BubbleAndSelectionSorting.sortArrayfromSmallertoBigger(BubbleAndSelectionSorting.createNewArray()));
                break;
            case 2:
                ArrayPrint.printArrayInLine(BubbleAndSelectionSorting.sortArrayfromBiggertoSmaller(BubbleAndSelectionSorting.createNewArray()));
                break;
            case 3:
                ArrayPrint.printArrayInLine(BubbleAndSelectionSorting.sortArrayUsingSelectionSortingfromSmallertoBigger(BubbleAndSelectionSorting.createNewArray()));
                break;
            default:
                System.out.println("Oooops. Entered value is incorrect. Please enter either \"exit\" or numbers 1,2 or 3");
        }
    }
}