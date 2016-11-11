package com.vladyslavvlasov.app.homework.lesson12;

import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

import java.util.Arrays;

/**
 * Created by Murcielago on 11.11.2016.
 */
public class Keyword {
    public static String[] splitString(String s, String keyword) {
        String[] arrayOfString;
        if (checkIfContainsSmth(s, keyword)) {
            arrayOfString = s.split(keyword);
            for (int i = 0; i < arrayOfString.length; i++) {
                System.out.println(arrayOfString[i].trim() + "\n");
            }
            return arrayOfString;
        } else {
            arrayOfString = s.split(" ");
            System.out.println(s + "\n");
        }
        return arrayOfString;
    }

    public static boolean checkIfContainsSmth(String s, String keyword) {
        if (s.contains(keyword)) {
            return true;
        } else
            return false;
    }
}
