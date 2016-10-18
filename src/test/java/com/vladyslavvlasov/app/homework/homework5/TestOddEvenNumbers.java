package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.OddEvenNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 17.10.2016.
 */
public class TestOddEvenNumbers {
    @Test
    public void testIt() {
        boolean expectedResult = true;
        OddEvenNumber newObj = new OddEvenNumber();

        Assert.assertEquals(expectedResult, newObj.isOdd(6));
    }
}
