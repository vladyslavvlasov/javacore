package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.OddEvenNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 17.10.2016.
 */
public class OddEvenNumbersTest {
    @Test
    public void testIt() {
        boolean expectedResult = true;
        OddEvenNumber newObj = new OddEvenNumber();

        Assert.assertEquals(expectedResult, newObj.isOdd(6));
    }
    @Test
    public void testIt2() {
        OddEvenNumber newObj = new OddEvenNumber();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, newObj.isOdd(5));
    }
    @Test
    public void testIt3() {
        OddEvenNumber newObj = new OddEvenNumber();
        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, newObj.isOdd(0));
    }
}
