package com.vladyslavvlasov.app.homework.lesson12;

/**
 * Created by Murcielago on 10.11.2016.
 */
public class CaesarAlgorithm {
    public static final String ringLang = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

    public static String encode(String str, int codeNum) {
        String s = str.toUpperCase();
        StringBuilder builder = new StringBuilder();
        int counter;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < ringLang.length(); j++) {
                if (s.charAt(i) == ringLang.charAt(j)) {
                    counter = j + codeNum;
                    if (counter < ringLang.length()) {
                        builder.append(ringLang.charAt(counter));
                    } else
                        builder.append(ringLang.charAt(counter - ringLang.length()));
                }
            }
        }
        String result = builder.toString();
        System.out.println("Your coded message is " + result);
        return result;
    }

    public static String decode(String str, int codeNum) {
        String s = str.toUpperCase();
        StringBuilder builder = new StringBuilder();
        int counter;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < ringLang.length(); j++) {
                if (s.charAt(i) == ringLang.charAt(j)) {
                    counter = j - codeNum;
                    if (counter >= 0) {
                        builder.append(ringLang.charAt(counter));
                    }
                    if (counter < 0) {
                        builder.append(ringLang.charAt(counter + ringLang.length()));
                    }
                }
            }
        }
        String result = builder.toString();
        System.out.println("Your decoded message is " + result);
        return result;
    }
}

