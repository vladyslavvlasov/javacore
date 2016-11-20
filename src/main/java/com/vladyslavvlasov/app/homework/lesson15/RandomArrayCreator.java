package com.vladyslavvlasov.app.homework.lesson15;

import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

import java.util.Arrays;

/**
 * Created by Murcielago on 20.11.2016.
 */
public class RandomArrayCreator {

    public int a;
    public int b;
    int[] singleArray;
    int[][] doubleArray;

    public int[]create(int a){
        singleArray = new int[a];
        for (int i=0; i < singleArray.length;i++){
            singleArray[i]=(int)(Math.random() *100);
        }
        return singleArray;
    }
    public int [][]create (int a, int b){
        doubleArray= new int[a][b];
        for (int i =0; i< doubleArray.length; i++){
            for (int j=0;j <doubleArray[i].length;j++){
                doubleArray[i][j]=(int)(Math.random() *100);
            }
        }
        return doubleArray;
    }
}
