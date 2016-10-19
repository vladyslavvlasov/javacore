package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.RightSidedTriangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 17.10.2016.
 */
public class RightSidedTriangleCheckerTest {
    @Test
    public void testIt() {
        boolean expectedResult = true;
        RightSidedTriangle newTriangle = new RightSidedTriangle();
        Assert.assertEquals(expectedResult, newTriangle.rightTriangleChecker(5, 4, 3));
    }
    @Test
    public void testIt2() {
        boolean expectedResult = false;
        RightSidedTriangle newTriangle = new RightSidedTriangle();
        Assert.assertEquals(expectedResult, newTriangle.rightTriangleChecker(10, 13, 8));
    }
}
