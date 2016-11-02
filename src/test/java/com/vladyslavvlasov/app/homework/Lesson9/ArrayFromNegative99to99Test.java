package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson9.ArrayFromNegative99to99;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 02.11.2016.
 */
public class ArrayFromNegative99to99Test {
    @Test
    public void testArrayLength() {
        int expRes = 5;
        ArrayFromNegative99to99 newObj = new ArrayFromNegative99to99();
        Assert.assertEquals(expRes, newObj.createArrayFromNegative99to99().length);
    }

    @Test
    public void testMinMaxBoundaries() {
        int expRes = 0;
        int flag = 0;
        int[][] superMatrix = ArrayFromNegative99to99.createArrayFromNegative99to99();
        for (int i = 0; i < superMatrix.length; i++) {
            for (int j = 0; j < superMatrix[i].length; j++) {
                if (superMatrix[i][j] < -99 || j > 99) {
                    flag = 1;
                }
            }
        }
        Assert.assertEquals(expRes, flag);
    }
}
