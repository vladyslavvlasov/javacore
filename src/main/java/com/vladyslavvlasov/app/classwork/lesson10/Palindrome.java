package com.vladyslavvlasov.app.classwork.lesson10;

/**
 * Created by Murcielago on 02.11.2016.
 */
public class Palindrome {
    public static boolean checkIfPalindrome1(String pal) {
        boolean isPalindrome = false;
        for (int i = 0; i < pal.length() / 2; i++) {
            if (pal.charAt(i) == pal.charAt(pal.length() - 1 - i)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
        return isPalindrome;
    }

    public static boolean checkIfPalindrome2(String pal) {
        boolean isPalindrome = false;
        String secondPal = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            secondPal = secondPal + pal.charAt(i);
        }
        if (pal.equals(secondPal)) {
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
        return isPalindrome;
    }

    public static boolean checkIfPalindrome3(String pal) {
        boolean isPalindrome = false;
        int index = pal.length() / 2;
        if (pal.length() % 2 == 1) {
            for (int j = pal.length() / 2; j >= 0; j--) {
                if (pal.charAt(j) == pal.charAt(index)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
                index++;
            }
        } else {
            for (int i = (pal.length() / 2) - 1; i >= 0; i--) {
                if (pal.charAt(i) == pal.charAt(index)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
                index++;
            }
        }
        System.out.println(isPalindrome);
        return isPalindrome;
    }

    public static boolean checkIfPalindrome4(String pal) {
        boolean isPalindrome = false;
        String newPal1 = "";
        String newPal2 = "";
        for (int i = 0; i < (pal.length() / 2); i++) {
            newPal1 = newPal1 + pal.charAt(i);
            newPal2 = newPal2 + pal.charAt(pal.length() - 1 - i);
            if (newPal1.equals(newPal2)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
        return isPalindrome;
    }
}
