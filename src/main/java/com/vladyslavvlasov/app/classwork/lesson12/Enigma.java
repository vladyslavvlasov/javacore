package com.vladyslavvlasov.app.classwork.lesson12;

/**
 * Created by Murcielago on 09.11.2016.
 */
public class Enigma {
    public static final String normLang = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    public static final String codeLang = "POIUYTREWQS^&9871234560=-@ ";

    public static String cipher(String s, String x, String y) {

        StringBuilder builder = new StringBuilder("");
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < x.length(); j++) {
                if (s.charAt(i) == x.charAt(j)) {
                    counter = j;
                }
            }
            builder.append(y.charAt(counter));
        }
        s = builder.toString();
        return s;
    }

    public static String encode(String input) {
        String inputUpper = input.toUpperCase();
        String codedString = cipher(inputUpper, normLang, codeLang);
        System.out.println("Your coded message is " + codedString);
        return codedString;
    }

    public static String decode(String input) {
        String decodedString = cipher(input, codeLang, normLang);
        System.out.println("Your decoded message is " + decodedString);
        return decodedString;
    }
}
