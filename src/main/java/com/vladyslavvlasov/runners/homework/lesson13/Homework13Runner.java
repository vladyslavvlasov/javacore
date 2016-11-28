package com.vladyslavvlasov.runners.homework.lesson13;

import com.vladyslavvlasov.app.classwork.lesson13.PalindromeFromFile;
import com.vladyslavvlasov.app.homework.lesson13.ArraysOfNums;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by Murcielago on 14.11.2016.
 */
public enum  Homework13Runner {A,B,C,D;

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose one of the following programs or type in \"exit\" to finish the program");
            System.out.println("Enter \"a\" for Arrays reader program");
            System.out.println("Enter \"b\" reader program");
            System.out.println("Enter \"c\"For Writing to file until exit program");
            System.out.println("Enter \"d\"For Properties program");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else
                Homework13Runner.runPrograms(input.toUpperCase());
        }
    }

    public static void runPrograms(String choice) {
        try {
            Homework13Runner choice2 = Homework13Runner.valueOf(choice);
            switch (choice2) {
                case A:
                    ArraysOfNums.readAndWriteArraysToFile();
                    break;
                case B:
                    PalindromeFromFile.writePalindromeCheckResult();
                    break;
                case C:
                    String fileDir = ArraysOfNums.getFilePath();
                    System.out.println("This program will write your input to the file. Please type in the desired name of the file");
                    Scanner scanner = new Scanner(System.in);
                    String filename = scanner.nextLine();
                    System.out.println("Now go on typing words and clicking Enter after each word. When you're done, please type in \"exit\" to save results and exit the program");
                    try {
                        String userInput;
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "lesson13" + File.separator + filename + ".txt")));
                        do {
                            userInput = scanner.nextLine();
                            if (userInput.equalsIgnoreCase("exit")) {
                                writer.close();
                                break;
                            }
                            writer.append(userInput);
                            writer.newLine();
                        }
                        while (!userInput.equalsIgnoreCase("exit"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case D:
                    scanner = new Scanner(System.in);
                    System.out.println("Please enter a property key and its value separated by comma, eg. \"databasename,localhost\". When ready, press \"Enter\"");
                    String keyInput;
                    try {
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ArraysOfNums.getFilePath() + "config.properties")));
                        do {
                            keyInput = scanner.nextLine();
                            String propToWrite = keyInput.replaceAll(" ", "").replace(",", "=");
                            writer.append(propToWrite);
                            writer.newLine();
                        }
                        while (keyInput.length() > 0);
                        writer.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Your \"Your config.properties file should be created in your working directory. Please check it.\"");
                    break;
            }
        }catch (IllegalArgumentException e){
            System.out.println("Wrong choice. Please chosse a, b,c or d");
        }
    }
}
