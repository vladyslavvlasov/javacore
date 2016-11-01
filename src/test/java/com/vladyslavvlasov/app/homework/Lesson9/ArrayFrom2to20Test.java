package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson7.ArrayFrom2to20;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 30.10.2016.
 */
public class ArrayFrom2to20Test {
    @Test
    public void testArrayFrom2to20(){
        ArrayFrom2to20 newObject =new ArrayFrom2to20();
        int expectedResult = 10;
        Assert.assertEquals(expectedResult,newObject.createArrayFrom2to20().length);
    }
}
