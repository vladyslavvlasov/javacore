package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson3.WideningCasting;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 16.10.2016.
 */
public class TestWideningCasting {
    @Test
    public void testIt() {
        double expectedResult = 127.00;
        WideningCasting newObject = new WideningCasting();
        Assert.assertEquals(expectedResult, newObject.wideIt(), 0.0);
    }
}
