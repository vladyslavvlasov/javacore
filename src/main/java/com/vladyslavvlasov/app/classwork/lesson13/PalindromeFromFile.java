package com.vladyslavvlasov.app.classwork.lesson13;

import com.vladyslavvlasov.app.classwork.lesson10.Palindrome;
import com.vladyslavvlasov.app.homework.lesson13.ArraysOfNums;

import java.io.*;

/**
 * Created by Murcielago on 12.11.2016.
 */
public class PalindromeFromFile {

    public static void writePalindromeCheckResult() {
        try {
            String fileDir = ArraysOfNums.getFilePath();
            BufferedReader reader = new BufferedReader(new FileReader(fileDir + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "lesson13" + File.separator + "input.txt"));
            String line;
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "lesson13" + File.separator + "output.txt")));
            while ((line = reader.readLine()) != null) {
                boolean checkIfPal = Palindrome.checkIfPalindrome1(line);
                if (checkIfPal == true) {
                    writer.append(line + " is palindrome");
                    writer.newLine();
                } else {
                    writer.append(line + " is not a palindrome");
                    writer.newLine();
                }
            }
            reader.close();
            writer.close();
            System.out.println("Your result of palindrome check should be in output.txt file. Please check it.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
