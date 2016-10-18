package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.RightSidedTriangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 17.10.2016.
 */
public class TestRightSidedTriangle1 {
    @Test
    public void testIt() {
        boolean expectedResult = true;
        RightSidedTriangle newTriangle = new RightSidedTriangle();
        Assert.assertEquals(expectedResult, newTriangle.rightTriangleChecker(5, 4, 3));
    }
}
