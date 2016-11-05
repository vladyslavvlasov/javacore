package com.vladyslavvlasov.runners.homework.lesson9;

import com.vladyslavvlasov.app.homework.lesson9.Multiplication;

import java.util.Arrays;

/**
 * Created by Murcielago on 02.11.2016.
 */
public class MultiplicationRunner {
    public static void main(String[] args) {
        String[] tempTable = Multiplication.createMultiplicationTable();
        System.out.println("All possible combinations are: " + Arrays.toString(tempTable));
        Multiplication.createTeacherArray();
    }
}