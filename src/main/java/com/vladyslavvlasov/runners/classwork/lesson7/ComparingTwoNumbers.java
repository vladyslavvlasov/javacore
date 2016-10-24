package com.vladyslavvlasov.runners.classwork.lesson7;

import java.util.Scanner;

/**
 * Created by Murcielago on 22.10.2016.
 */
public class ComparingTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
     ComparingTwoNumbers newClass = new ComparingTwoNumbers();
        newClass.compare2numbers(a,b);
    }
    public void compare2numbers (int a, int b) {
        while (a >b)
        {
            System.out.println("Your a is "+ a + " Your b is "+ b);
            a--;
        }
        System.out.println("Your a is "+ a + " Your b is "+ b);
    }
}
