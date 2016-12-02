package com.vladyslavvlasov.app.classwork.lesson18;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Murcielago on 30.11.2016.
 */
public class ArraySorterGenerics<T extends Number> {
    private T[] t;


    public ArraySorterGenerics(T[] t) {
        this.t = t;
    }


    public T[] sort() {
        return sort(t);
    }


    public static <T extends Number> T[] sort(T[] array) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        T temp;   //holding variable


        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < array.length - 1; j++) {
                if (array[j].doubleValue() < array[j + 1].doubleValue())   // change to > for ascending sort
                {
                    temp = array[j];                //swap elements
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = 100 + i;
        }

        System.out.println(Arrays.toString(integers));
        ArraySorterGenerics<Integer> arraySorterGenerics = new ArraySorterGenerics<>(integers);
        Integer[] sort = arraySorterGenerics.sort();
        System.out.println(Arrays.toString(sort));
        Integer[] sort2 = ArraySorterGenerics.sort(integers);
        System.out.println(Arrays.toString(sort2));
    }
}
