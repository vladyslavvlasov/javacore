package com.vladyslavvlasov.app.homework.lesson9;

import java.util.Arrays;

/**
 * Created by Murcielago on 01.11.2016.
 */
public class BubbleAndSelectionSorting {
    public static int[] sortArrayfromSmallertoBigger(int[] bubbleArray) {
        int i;
        int j;
        int temp;
        do {
            j = 0;
            for (i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] > bubbleArray[i + 1]) {
                    temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = temp;
                    j = 1;
                }
            }
        }
        while (j > 0);
        return bubbleArray;
    }

    public static int[] sortArrayfromBiggertoSmaller(int[] bubbleArray) {
        int i;
        int j;
        int temp;
        do {
            j = 0;
            for (i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] < bubbleArray[i + 1]) {
                    temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = temp;
                    j = 1;
                }
            }
        }
        while (j > 0);
        return bubbleArray;
    }
public static int[] sortArrayUsingSelectionSortingfromSmallertoBigger(int[] array){
        int i,j,temp,index;
    for (i =0;i<array.length-1;i++ ){
        //first =0;
        index=i;
        for (j=i+1;j<array.length;j++){
            if(array[j]<array[index]){
               index=j;
            }
        }
        temp =array[index];
        array[index]=array[i];
        array[i]=temp;
    }
    return array;
    }
    public static int[] createNewArray() {
        int[] arrayForBubbleSort = {2, 5, 4, 1, 3};
        return arrayForBubbleSort;
    }
    public static double[] sortDoubleArrayfromSmallertoBigger(double[] bubbleArray) {
        int i;
        int j;
        double temp;
        do {
            j = 0;
            for (i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] > bubbleArray[i + 1]) {
                    temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = temp;
                    j = 1;
                }
            }
        }
        while (j > 0);
        return bubbleArray;
    }
    public static double[] sortDoubleArrayfromBiggertoSmaller(double[] bubbleArray) {
        int i;
        int j;
        double temp;
        do {
            j = 0;
            for (i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] < bubbleArray[i + 1]) {
                    temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = temp;
                    j = 1;
                }
            }
        }
        while (j > 0);
        return bubbleArray;
    }
}
