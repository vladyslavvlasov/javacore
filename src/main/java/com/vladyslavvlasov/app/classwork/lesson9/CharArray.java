package com.vladyslavvlasov.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by Murcielago on 29.10.2016.
 */
public class CharArray {
    public static void main(String[] args) {
        char [] charArray=new char[256];
        for (int i = 0; i < charArray.length; i++){
            charArray[i]=(char)i;
        }
        System.out.println("Char array is " + Arrays.toString(charArray));
    }
}
