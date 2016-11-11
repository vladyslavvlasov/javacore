package com.vladyslavvlasov.runners.homework.lesson12;

import com.vladyslavvlasov.app.classwork.lesson12.Enigma;
import com.vladyslavvlasov.app.homework.lesson12.ABCarray;
import com.vladyslavvlasov.app.homework.lesson12.ArrayParser;
import com.vladyslavvlasov.app.homework.lesson12.CaesarAlgorithm;
import com.vladyslavvlasov.app.homework.lesson12.Keyword;
import com.vladyslavvlasov.app.homework.lesson9.BubbleAndSelectionSorting;
import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

import java.util.Scanner;

/**
 * Created by Murcielago on 10.11.2016.
 */
public class Homework12Runner {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please choose one of the following problems by introducing a number.Type in \"exit\" to stop the program");
            System.out.println("Introduce 1 to start Enigma program");
            System.out.println("Introduce 2 to start Caesar Algorithm program");
            System.out.println("Introduce 3 to start Array Parser program");
            System.out.println("Introduce 4 to start ABCArray program");
            System.out.println("Introduce 5 to start Keyword program");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else
                runPrograms(Integer.parseInt(input));

        }
    }

    public static void runPrograms(int numberOfInp) {
        switch (numberOfInp) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please choose if you want to code or decode the string");
                System.out.println("Press 1 for coding the string");
                System.out.println("Press 2 for decoding the string");
                String userInput = scanner.nextLine();
                if (Integer.parseInt(userInput) == 1) {
                    System.out.println("Please enter a string for encoding");
                    String str = scanner.nextLine();
                    Enigma.encode(str);
                } else {
                    System.out.println("Please enter a string to decode");
                    String str = scanner.nextLine();
                    Enigma.decode(str);
                }
                break;
            case 2:
                scanner = new Scanner(System.in);
                System.out.println("Please choose if you want to code or decode the string");
                System.out.println("Press 1 for coding the string");
                System.out.println("Press 2 for decoding the string");
                userInput = scanner.nextLine();
                if (Integer.parseInt(userInput) == 1) {
                    System.out.println("Please enter a string for encoding");
                    String str = scanner.nextLine();
                    System.out.println("Please enter a code number for encoding");
                    int codeNumber = Integer.parseInt(scanner.nextLine());
                    CaesarAlgorithm.encode(str, codeNumber);
                } else {
                    System.out.println("Please enter a string for decoding");
                    String str = scanner.nextLine();
                    System.out.println("Please enter a code number for decoding");
                    int codeNumber = Integer.parseInt(scanner.nextLine());
                    CaesarAlgorithm.decode(str, codeNumber);
                }
                break;
            case 3:
                scanner = new Scanner(System.in);
                System.out.println("Please enter a symbol you want to divide an array with(not .)");
                String divider = scanner.nextLine();
                if (divider.length() == 1) {
                    System.out.println("Please enter a few numbers separated by the divider chosen in the previous step, then click Enter");
                    String numbersInput = scanner.nextLine();
                    if (numbersInput.contains(".")){
                        double[] producedArr = ArrayParser.createDoubleArr(numbersInput, divider);
                        System.out.println("Please type 1 for ascending sorting or 2 for descending order");
                        userInput = scanner.nextLine();
                        if (Integer.parseInt(userInput) == 1) {
                            ArrayPrint.printDoubleArrayInLine(BubbleAndSelectionSorting.sortDoubleArrayfromSmallertoBigger(producedArr));
                        } else
                            ArrayPrint.printDoubleArrayInLine(BubbleAndSelectionSorting.sortDoubleArrayfromBiggertoSmaller(producedArr));
                    }
                        else {
                    int[] producedArr = ArrayParser.createIntArr(numbersInput, divider);
                    System.out.println("Please type 1 for ascending sorting or 2 for descending order");
                    userInput = scanner.nextLine();
                    if (Integer.parseInt(userInput) == 1) {
                        ArrayPrint.printArrayInLine(BubbleAndSelectionSorting.sortArrayfromSmallertoBigger(producedArr));
                    } else
                        ArrayPrint.printArrayInLine(BubbleAndSelectionSorting.sortArrayfromBiggertoSmaller(producedArr)); }
                } else
                    System.out.println("You must enter just one symbol. Please start over" + "\n");
                break;
            case 4:
                scanner = new Scanner(System.in);
                System.out.println("Please enter a symbol you want to divide an array with(not .)");
                divider = scanner.nextLine();
                System.out.println("Please enter data with words and numbers separated by a divider chosen above");
                String datainput =scanner.nextLine();
                ABCarray.createABCarr(datainput,divider);
                break;
            case 5:
                scanner =new Scanner(System.in);
                System.out.println("Please enter a message");
                String message = scanner.nextLine();
                System.out.println("Please enter a keyword");
                String keyword = scanner.nextLine();
                Keyword.splitString(message,keyword);
                break;
            default:
                System.out.println("In this homework there were only 5 tasks. Please choose 1,2,3,4 or 5");
                break;
        }
    }

}
