package com.vladyslavvlasov.app.classwork.lesson10;

/**
 * Created by Murcielago on 02.11.2016.
 */
public class CharToStringConvertor {
    public static String convertCharToString(char[] charArr) {
        String myString = "";
        for (int i = 0; i < charArr.length; i++) {
            myString = myString + charArr[i];
        }
        System.out.println(myString);
        return myString;
    }
}
