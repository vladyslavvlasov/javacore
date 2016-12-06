package com.vladyslavvlasov.app.classwork.lesson19;

import java.util.*;

/**
 * Created by Murcielago on 03.12.2016.
 */
public class KeyboardList {
    static ArrayList<String> myList = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Please enter words by one");
        Scanner scanner = new Scanner(System.in);
        do {
            String input = scanner.nextLine();
            if (input.length() == 0) {
                break;
            }
            myList.add(input);
        }
        while (true);
        HashSet hashSet = new HashSet(myList);
        System.out.println(myList);
        System.out.println(hashSet);
    }
}
