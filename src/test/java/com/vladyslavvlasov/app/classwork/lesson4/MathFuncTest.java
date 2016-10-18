package com.vladyslavvlasov.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 12.10.2016.
 */
public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 100, b = 2, expRes = 200;
        MathFunc math1 = new MathFunc();
        //math1.multiply(1,2);
        Assert.assertEquals(expRes, math1.multiply(a, b));
    }
}
