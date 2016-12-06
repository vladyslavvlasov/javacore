package com.vladyslavvlasov.app.classwork.lesson19;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Murcielago on 03.12.2016.
 */
public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        String str1= "zbc";
        myList.add(str1);
        String str2= "bcd";
        myList.add(str2);
        int theSize= myList.size();
        Collections.sort(myList);
        System.out.println("List size is " +theSize);
        System.out.println("Index of \"" +str1 +"\" is " + myList.indexOf(str1));
    }
}
