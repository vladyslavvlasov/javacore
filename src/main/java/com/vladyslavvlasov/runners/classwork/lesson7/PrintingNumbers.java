package com.vladyslavvlasov.runners.classwork.lesson7;

/**
 * Created by Murcielago on 22.10.2016.
 */
public class PrintingNumbers {
    public static void main(String[] args) {
        PrintingNumbers printer = new PrintingNumbers();
        printer.printArrayWithFor();
    }

    public void printNumbers() {
        for (int a = 0; a <= 10; a++) {
            System.out.println("Your number is " + a);
        }
    }

    public void increment() {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment a " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment a " + a);
    }

    public void countevennumbers() {
        int counter = 0;
        for (int i = 0; i <= 20; i += 2) {
            counter++;
        }
        System.out.println(counter);
    }

    public void printIntArray() {
        int[] intArray = {1, 2, 3};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public void printCharArray() {
        char[] charArray = {'*', '?', '!'};
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

    public void printDoubleArray() {
        double[] doubleArray = {1d, 2d, 3d};
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
    }

    public void printArrayWithFor() {
        int[] intArray = {1, 2, 3};
        for (int aelement : intArray) {
            System.out.println(aelement);
        }
    }
}