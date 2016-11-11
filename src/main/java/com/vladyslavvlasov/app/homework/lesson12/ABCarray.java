package com.vladyslavvlasov.app.homework.lesson12;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Murcielago on 10.11.2016.
 */
public class ABCarray {

    public static String createABCarr(String s, String divider) {

        String updatedString = s.replace(divider, "".replaceAll(" ",""));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < updatedString.length(); i++) {
            if (Character.isLetter(updatedString.charAt(i))) {
                builder.append(updatedString.charAt(i));
            }
        }
        String newStr = builder.toString();
        System.out.println(newStr);
        return newStr;
    }
}
