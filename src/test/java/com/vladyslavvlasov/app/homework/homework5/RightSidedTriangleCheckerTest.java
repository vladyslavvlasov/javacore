package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.RightSidedTriangle;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 17.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class RightSidedTriangleCheckerTest {
    @Test
    @FileParameters(value = "src/test/resources/righttriangledata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getData(int argA, int argB, int argC, boolean expectedResult) {
        RightSidedTriangle newTriangle = new RightSidedTriangle();
        Assert.assertEquals(expectedResult, newTriangle.rightTriangleChecker(argA, argB, argC));
    }
}
