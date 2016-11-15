package com.vladyslavvlasov.app.classwork.lesson13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Murcielago on 12.11.2016.
 */
public class FileReading {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("H:\\projects\\input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
e.printStackTrace();
        }
        finally {
            System.out.println("Print this message regardless of exception");
        }
    }
}
