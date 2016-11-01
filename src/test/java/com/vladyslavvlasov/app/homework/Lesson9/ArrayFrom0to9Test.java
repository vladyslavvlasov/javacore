package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson7.ArrayFrom0to9;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 30.10.2016.
 */
public class ArrayFrom0to9Test {
    @Test
    public void testIfArrayReturns(){
        int expectedResult = 15;
        ArrayFrom0to9 newObject= new ArrayFrom0to9();
        Assert.assertEquals(expectedResult,newObject.fillRandomArrayFrom0to9().length);
    }
}
