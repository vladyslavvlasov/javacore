package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.CircleArea;
import com.vladyslavvlasov.app.classwork.lesson5.CircleArea2;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 17.10.2016.
 */
public class TestCircleArea2Test2 {
    @Test
    public void testIt() {
        double expectedResult = 60;
        CircleArea2 newCircle = new CircleArea2();
        Assert.assertEquals(expectedResult, newCircle.calculateBigger(20, 60), 0.0);
    }
}
