package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson3.WideningCasting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 16.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class WideningCastingTest {
    @Test
    @FileParameters(value = "src/test/resources/wideningdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getData(byte argA, double expectedResult) {
        WideningCasting newObject = new WideningCasting();
        Assert.assertEquals(expectedResult, newObject.wideIt(argA), 0.0);
    }
}
