package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.ArrayApp;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 18.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class ArrayApp1KlychTest {
    @Test
    @FileParameters(value = "src/test/resources/klychdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getTestData(int argA, String[] expectedResult) {
        ArrayApp testApp = new ArrayApp();
        Assert.assertArrayEquals(expectedResult, testApp.returnKlych(argA));
    }
}
