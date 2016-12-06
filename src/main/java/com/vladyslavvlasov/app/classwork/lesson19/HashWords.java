package com.vladyslavvlasov.app.classwork.lesson19;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Murcielago on 03.12.2016.
 */
public class HashWords {
    public static void main(String[] args) {
HashSet hashSet = new HashSet();
        hashSet.add("A1");
        hashSet.add("A1");
        hashSet.add("B1");
        hashSet.add("C1");
        hashSet.add("D1");
        System.out.println(hashSet);
        TreeSet treeSet = new TreeSet(hashSet);
        System.out.println(treeSet);

    }
}
