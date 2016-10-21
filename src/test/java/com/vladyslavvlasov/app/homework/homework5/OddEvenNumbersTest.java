package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson5.OddEvenNumber;
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
public class OddEvenNumbersTest {
    @Test
    @FileParameters(value = "src/test/resources/oddevennumberdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getData(int argA, boolean expectedResult) {

        OddEvenNumber newObj = new OddEvenNumber();

        Assert.assertEquals(expectedResult, newObj.isOdd(argA));
    }
}
