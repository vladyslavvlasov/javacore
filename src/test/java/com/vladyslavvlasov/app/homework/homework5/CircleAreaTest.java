package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.CircleArea;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Scanner;

/**
 * Created by Murcielago on 16.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CircleAreaTest {
    @Test
    @FileParameters(value = "src/test/resources/circleareadata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void provideTestWithData(double argA, double expectedResult) {

        CircleArea testCircle = new CircleArea();

        Assert.assertEquals(expectedResult, testCircle.calculate(argA), 1.0);
    }


}
