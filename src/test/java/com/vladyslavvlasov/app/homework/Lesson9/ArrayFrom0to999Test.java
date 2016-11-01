package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson7.ArrayFrom0to999;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 30.10.2016.
 */
public class ArrayFrom0to999Test {
    @Test
    public void testArrayFrom0to999(){
        int expectedResult= 15;
        ArrayFrom0to999 newObject = new ArrayFrom0to999();
        Assert.assertEquals(expectedResult, newObject.createArrayFrom0to999().length);
    }
}
