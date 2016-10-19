package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.CircleArea;
import com.vladyslavvlasov.app.classwork.lesson5.CircleArea2;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 17.10.2016.
 */
public class CircleArea2CalculateBiggerAreaTest {
    @Test
    public void testIt() {
        double expectedResult = 40.0;
        CircleArea2 testCircle = new CircleArea2();
        Assert.assertEquals(expectedResult, testCircle.calculateBigger(40, 30), 0.0);
    }
    @Test
    public void testIt2() {
        double expectedResult = 60;
        CircleArea2 newCircle = new CircleArea2();
        Assert.assertEquals(expectedResult, newCircle.calculateBigger(20, 60), 0.0);
    }
}
