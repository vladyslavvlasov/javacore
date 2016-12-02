package com.vladyslavvlasov.runners.homework.lesson18;

import com.vladyslavvlasov.app.homework.lesson18.CardIndex;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Murcielago on 02.12.2016.
 */
public class Homework18Runner {
    static String line;
    static String csvFilePath = CardIndex.getFilePath() + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "lesson18" + File.separator + "cardindex.csv";


    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose by what criteria you want to choose a card:");
            System.out.println("1.By position");
            System.out.println("2.By name");
            System.out.println("3.By last name");
            System.out.println("4.By faculty");
            System.out.println("5.Search everywhere");
            System.out.println("Type \"exit\" to finish the program");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else
                try {
                    showCardInfo(Integer.parseInt(input));
                } catch (Exception e) {
                    System.out.println("Wrong input. Please type in 1,2,3,4 or \"exit\".");
                }
        }
    }

    public static void showCardInfo(int input) {
        switch (input) {
            case 1:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
                    int iteration = 0;
                    System.out.println("Welcome to position searcher. There are 3 options: Head, Professor, Student");
                    System.out.println("Please type in position you're looking for");
                    Scanner scanner = new Scanner(System.in);
                    String search = scanner.nextLine();
                    while ((line = reader.readLine()) != null) {
                        if (iteration == 0) {
                            iteration++;
                            continue;
                        }
                        String[] newLine = line.replaceAll(" ", "").split(",");
                        CardIndex.searchPosition(search, newLine);
                    }
                    CardIndex.checkResultIndex(CardIndex.resultIndex);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
                    int iteration = 0;
                    System.out.println("Please type in a name you're looking for");
                    Scanner scanner = new Scanner(System.in);
                    String search = scanner.nextLine();
                    CardIndex.resultIndex = 0;
                    while ((line = reader.readLine()) != null) {
                        if (iteration == 0) {
                            iteration++;
                            continue;
                        }
                        String[] newLine = line.replaceAll(" ", "").split(",");
                        CardIndex.searchName(search, newLine);
                    }
                    CardIndex.checkResultIndex(CardIndex.resultIndex);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
                    int iteration = 0;
                    System.out.println("Please type in a last name you're looking for");
                    Scanner scanner = new Scanner(System.in);
                    String search = scanner.nextLine();
                    while ((line = reader.readLine()) != null) {
                        if (iteration == 0) {
                            iteration++;
                            continue;
                        }
                        String[] newLine = line.replaceAll(" ", "").split(",");
                        CardIndex.searchLastName(search, newLine);
                    }
                    CardIndex.checkResultIndex(CardIndex.resultIndex);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
                    int iteration = 0;
                    System.out.println("We have Law, Philology and Philosophy faculties.");
                    System.out.println("Please type in a faculty you're looking for");
                    Scanner scanner = new Scanner(System.in);
                    String search = scanner.nextLine();
                    while ((line = reader.readLine()) != null) {
                        if (iteration == 0) {
                            iteration++;
                            continue;
                        }
                        String[] newLine = line.replaceAll(" ", "").split(",");
                        CardIndex.searchFaculty(search, newLine);
                    }
                    CardIndex.checkResultIndex(CardIndex.resultIndex);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
                    int iteration = 0;
                    System.out.println("Please type in a word you're looking for");
                    Scanner scanner = new Scanner(System.in);
                    String search = scanner.nextLine();
                    while ((line = reader.readLine()) != null) {
                        if (iteration == 0) {
                            iteration++;
                            continue;
                        }
                        String[] newLine = line.replaceAll(" ", "").split(",");
                        CardIndex.searchCardIndex(search, newLine);
                    }
                    CardIndex.checkResultIndex(CardIndex.resultIndex);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Wrong input.Please choose 1,2,3,4,5 or \"exit\".");
                break;
        }
    }

}
