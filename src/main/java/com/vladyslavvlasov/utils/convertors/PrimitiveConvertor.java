package com.vladyslavvlasov.utils.convertors;

/**
 * Created by Murcielago on 08.10.2016.
 */
public class PrimitiveConvertor {

    public char floatToChar(float float1){
char char1 = (char) float1;
        System.out.println ("Input float value is " + float1 +". Output char value is " + char1);
        return char1;
    }

    public char intToChar (int int1){
char char1 = (char)int1;
        System.out.println ("Input int value is " + int1 +". Output char value is " + char1);
        return char1;
    }

    public int charToInt (char char1){
int int1 = (int)char1;
        System.out.println ("Input char value is " + (char)char1 +". Output int value is " + int1);
        return int1;
    }
}
