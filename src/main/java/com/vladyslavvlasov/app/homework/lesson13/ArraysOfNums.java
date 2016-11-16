package com.vladyslavvlasov.app.homework.lesson13;

import com.vladyslavvlasov.app.homework.lesson9.BubbleAndSelectionSorting;
import com.vladyslavvlasov.runners.homework.lesson9.ArrayPrint;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Murcielago on 14.11.2016.
 */
public class ArraysOfNums {
    public static void main(String[] args) {
        ArraysOfNums.getFilePath();
    }

    public static void readAndWriteArraysToFile() {
        try {
            String fileDir = ArraysOfNums.getFilePath();
            BufferedReader reader = new BufferedReader(new FileReader(fileDir + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "lesson13" + File.separator + "arraysofnumsinput"));
            //BufferedReader reader = new BufferedReader(new FileReader("H:\\projects\\javacore\\src\\test\\resources\\lesson13\\arraysofnumsinput"));
            String line;
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "lesson13" + File.separator + "arraysofnumsoutput")));
            while ((line = reader.readLine()) != null) {
                String[] newArr = line.split(",");
                int[] intArr = new int[newArr.length];
                for (int i = 0; i < newArr.length; i++) {
                    intArr[i] = Integer.parseInt(newArr[i]);
                }
                int[] sortedArr = BubbleAndSelectionSorting.sortArrayfromSmallertoBigger(intArr);
                writer.append(ArraysOfNums.convertIntArrToString(sortedArr));
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Files must have been written to arraysofnumsoutput.txt at "+ fileDir + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "lesson13" + File.separator +" Please have a look at it." + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convertIntArrToString(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                builder.append(arr[i]);
            } else
                builder.append(arr[i] + ", ");
        }
        String resultStr = builder.toString();
        return resultStr;
    }

    public static String getFilePath() {
        String workingDir = System.getProperty("user.dir");
        String absoluteFilePath = workingDir + File.separator;
        return absoluteFilePath;
    }
}

