package com.vladyslavvlasov.runners.homework.lesson19;

import com.vladyslavvlasov.app.homework.lesson19.NameCatalogue;

import java.util.Scanner;

/**
 * Created by Murcielago on 05.12.2016.
 */
public class Homework19Runner {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hey! Please enter the name of category or press Enter 2 times to exit");
            String catName = scanner.nextLine();
            if (catName.length() > 0) {
                if (NameCatalogue.catalogue.containsKey(catName)) {
                    System.out.println("These are your values for key " + catName + ": " + NameCatalogue.catalogue.get(catName));
                    System.out.println("Please type in \"Yes\" if you want to change values, \"No\" if you want to keep them,\"Key\" if you want to change key or \"exit\" to end the program");
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        NameCatalogue.updateCat(catName);
                    } else if (answer.equalsIgnoreCase("no")) {
                        continue;
                    } else if (answer.equalsIgnoreCase("exit")) {
                        System.exit(0);
                    } else if (answer.equalsIgnoreCase("key")) {
                        NameCatalogue.changeKey(catName);
                    } else {
                        System.out.println("Incorrect input. You have to type in yes or no. Please start again");
                    }
                } else {
                    NameCatalogue.createNewCat();
                }
            } else {
                System.exit(0);
            }
        }
    }
}
