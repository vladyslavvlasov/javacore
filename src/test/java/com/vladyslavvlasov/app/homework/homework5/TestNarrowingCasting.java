package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson3.NarrowingCasting;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Murcielago on 16.10.2016.
 */
public class TestNarrowingCasting {
    @Test
    public void testCode() {
        int expectedResult = 3;
        NarrowingCasting myObject = new NarrowingCasting();
        Assert.assertEquals(expectedResult, myObject.narrowing());
    }

}
