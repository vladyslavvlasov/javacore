package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.classwork.lesson3.NarrowingCasting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Murcielago on 16.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class NarrowingCastingTest {
    @Test
    @FileParameters(value = "src/test/resources/narrowingcastdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testNarrowingCasting(float argA, int expectedResult) {
        NarrowingCasting myObject = new NarrowingCasting();
        Assert.assertEquals(expectedResult, myObject.narrowing(argA));
    }
}
