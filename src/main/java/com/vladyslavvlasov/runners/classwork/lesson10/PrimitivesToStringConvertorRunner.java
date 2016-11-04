package com.vladyslavvlasov.runners.classwork.lesson10;

import com.vladyslavvlasov.app.classwork.lesson10.PrimitivesToStringConvertor;

import java.util.Scanner;

/**
 * Created by Murcielago on 04.11.2016.
 */
public class PrimitivesToStringConvertorRunner {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose one of convertors");
            System.out.println("1.Boolean to String");
            System.out.println("2.Integer to String");
            System.out.println("3.Double to String");
            System.out.println("4.Long to String");
            System.out.println("5.String to Boolean");
            System.out.println("6.String to Integer");
            System.out.println("7.String to Long");
            System.out.println("8.String to Double");
            System.out.println("Press 9 to exit the program");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 9) {
                System.exit(0);
            } else
                PrimitivesToStringConvertorRunner.runConvertor(input);
        }
    }

    public static void runConvertor(int input) {
        switch (input) {
            case 1:
                boolean bool = true;
                PrimitivesToStringConvertor.convertBoolToString(bool);
                break;
            case 2:
                int wowInt = 898989;
                PrimitivesToStringConvertor.convertIntToString(wowInt);
                break;
            case 3:
                double superD = 98.76;
                PrimitivesToStringConvertor.convertDoubleToString(superD);
                break;
            case 4:
                long superL = 88484848484l;
                PrimitivesToStringConvertor.convertLongToString(superL);
                break;
            case 5:
                String s = "false";
                PrimitivesToStringConvertor.convertStringtoBoolean(s);
                break;
            case 6:
                String s2 = "757";
                PrimitivesToStringConvertor.convertStringtoInt(s2);
                break;
            case 7:
                String s3 = "7676";
                PrimitivesToStringConvertor.convertStringtoLong(s3);
                break;
            case 8:
                String s4 = "34.95";
                PrimitivesToStringConvertor.convertStringtoDouble(s4);
                break;
        }
    }
}
