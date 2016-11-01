package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.BiggerAreaCalculation;
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
public class BiggerAreaCalculationTest {
    @Test
    @FileParameters(value = "src/test/resources/biggerareadata.csv",
            mapper = CsvWithHeaderMapper.class)

    public void compareAreas(double argA, double argB, double expectedResult) {
        BiggerAreaCalculation testCircle = new BiggerAreaCalculation();
        Assert.assertEquals(expectedResult, testCircle.calculateBigger(argA, argB), 0.0);
    }
}
