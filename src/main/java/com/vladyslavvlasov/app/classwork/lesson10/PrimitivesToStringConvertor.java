package com.vladyslavvlasov.app.classwork.lesson10;

/**
 * Created by Murcielago on 02.11.2016.
 */
public class PrimitivesToStringConvertor {

    public static String convertIntToString(int newInt) {
        String myString = String.valueOf(newInt);
        System.out.println(myString);
        return myString;
    }

    public static String convertBoolToString(boolean bool) {
        String myString = String.valueOf(bool);
        System.out.println(myString);
        return myString;
    }

    public static String convertDoubleToString(double d) {
        String myString = String.valueOf(d);
        System.out.println(myString);
        return myString;
    }

    public static String convertLongToString(long l) {
        String myString = String.valueOf(l);
        System.out.println(myString);
        return myString;
    }

    public static Boolean convertStringtoBoolean(String s) {
        Boolean newBool = Boolean.valueOf(s);
        System.out.println(newBool);
        return newBool;
    }

    public static int convertStringtoInt(String str) {
        int newInt = Integer.valueOf(str);
        System.out.println(newInt);
        return newInt;
    }

    public static long convertStringtoLong(String str) {
        long newLong = Long.valueOf(str);
        System.out.println(newLong);
        return newLong;
    }

    public static double convertStringtoDouble(String str) {
        double newDouble = Double.valueOf(str);
        System.out.println(newDouble);
        return newDouble;
    }
}

