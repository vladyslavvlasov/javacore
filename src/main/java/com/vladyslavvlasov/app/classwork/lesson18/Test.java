package com.vladyslavvlasov.app.classwork.lesson18;

/**
 * Created by Murcielago on 30.11.2016.
 */
public class Test {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(new Integer( 10));
        System.out.println(value1);
        Integer intValue1 = (Integer)value1.getValue();
        BoxPrinter value2 = new BoxPrinter("Hello World");
        System.out.println(value2);
//Integer intValue2 = (Integer)value2.getValue();
    }
}
