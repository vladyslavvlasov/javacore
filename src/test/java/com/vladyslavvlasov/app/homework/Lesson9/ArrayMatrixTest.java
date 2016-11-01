package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson7.ArrayMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 30.10.2016.
 */
public class ArrayMatrixTest {
    @Test
    public void testArrayMatrixTest (){
        ArrayMatrix newObj = new ArrayMatrix();
        int expectedResult = 8;
        Assert.assertEquals(expectedResult,newObj.createMatrixArray().length);
    }
}
