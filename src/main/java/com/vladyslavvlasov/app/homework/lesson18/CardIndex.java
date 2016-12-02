package com.vladyslavvlasov.app.homework.lesson18;

import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Murcielago on 02.12.2016.
 */
public class CardIndex {
    public static int resultIndex;

    public static void searchCardIndex(String name, String[] line) {
        for (int i = 1; i < line.length; i++) {
            if (name.equalsIgnoreCase(line[i])) {
                System.out.println("This is your card: " + Arrays.toString(line));
                resultIndex = 1;
            }
        }
    }

    public static void searchName(String name, String[] line) {
        if (name.equalsIgnoreCase(line[1])) {
            System.out.println("This is your card: " + Arrays.toString(line));
            resultIndex = 1;
        }
    }

    public static void searchPosition(String name, String[] line) {
        if (name.equalsIgnoreCase(line[0])) {
            System.out.println("This is your card: " + Arrays.toString(line));
            resultIndex = 1;
        }
    }

    public static void searchLastName(String name, String[] line) {
        if (name.equalsIgnoreCase(line[2])) {
            System.out.println("This is your card: " + Arrays.toString(line));
            resultIndex = 1;
        }
    }

    public static void searchFaculty(String name, String[] line) {
        if (name.equalsIgnoreCase(line[3])) {
            System.out.println("This is your card: " + Arrays.toString(line));
            resultIndex = 1;
        }
    }


    public static String getFilePath() {
        String workingDir = System.getProperty("user.dir");
        String absoluteFilePath = workingDir + File.separator;
        return absoluteFilePath;
    }

    public static void checkResultIndex(int index) {
        if (index == 0) {
            System.out.println("Your search hasn't produced any results");
        }
    }
}
