package com.vladyslavvlasov.app.classwork.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 19.10.2016.
 */

@RunWith(JUnitParamsRunner.class)


public class MathFunctionsTest {


    @Test
    @FileParameters(value = "src/test/resources/testdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        MathFunctions testObject = new MathFunctions();
        Assert.assertEquals(expOut, testObject.multiply(argA, argB));
    } //make sure that variables are in same order and types as in csv file

}






