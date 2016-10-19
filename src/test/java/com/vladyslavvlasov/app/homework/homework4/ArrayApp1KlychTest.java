package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.ArrayApp;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class ArrayApp1KlychTest {
    @Test
    public void testIt (){
        String[] expectedResult = {"Slava Ukraini","Heroyam Slava"};
        ArrayApp testApp = new ArrayApp();
        Assert.assertArrayEquals(expectedResult, testApp.returnKlych(0));
    }
    @Test
    public void testIt2 (){
        String[] expectedResult = {"Slava Nazii","Smert Vorogam"};
        ArrayApp testApp = new ArrayApp();
        Assert.assertArrayEquals(expectedResult, testApp.returnKlych(1));
    }
    @Test
    public void testIt3 (){
        String[] expectedResult = {"Ukraina","Ponad use"};
        ArrayApp testApp = new ArrayApp();
        Assert.assertArrayEquals(expectedResult, testApp.returnKlych(2));
    }
}
