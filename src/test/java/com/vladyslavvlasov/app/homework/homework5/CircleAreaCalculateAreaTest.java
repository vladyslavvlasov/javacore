package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.CircleArea;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Murcielago on 16.10.2016.
 */
public class CircleAreaCalculateAreaTest {
    @Test
    public void testCircleArea() {
        double expectedResult = 7853.00;
        CircleArea testCircle = new CircleArea();

        Assert.assertEquals(expectedResult, testCircle.calculate(50), 1.0);
    }


}
