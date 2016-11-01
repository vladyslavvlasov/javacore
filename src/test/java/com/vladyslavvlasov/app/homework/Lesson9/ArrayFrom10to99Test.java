package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson7.ArrayFrom10to99;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 30.10.2016.
 */
public class ArrayFrom10to99Test {
    @Test
    public void testArrayFrom10to99Length(){
        int expectedResult=8;
        ArrayFrom10to99 newObj = new ArrayFrom10to99();
        Assert.assertEquals(expectedResult,newObj.fillArray().length);
    }
}
