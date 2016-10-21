package com.vladyslavvlasov.app.homework.homework5;

import com.vladyslavvlasov.app.utils.convertors.PrimitiveConvertor;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 21.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class PrimitiveConvertorTest {
    @Test
    @FileParameters(value = "src/test/resources/primitiveconvertorfiles/chartointdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getDataCharToInt(char argA, int expectedResult) {
        PrimitiveConvertor convertorTest = new PrimitiveConvertor();
        Assert.assertEquals(expectedResult, convertorTest.charToInt(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/primitiveconvertorfiles/inttochardata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getDataIntToChar(int argA, char expectedResult) {
        PrimitiveConvertor convertorTest = new PrimitiveConvertor();
        Assert.assertEquals(expectedResult, convertorTest.intToChar(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/primitiveconvertorfiles/inttochardata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getDataFloatToChar(float argA, char expectedResult) {
        PrimitiveConvertor convertorTest = new PrimitiveConvertor();
        Assert.assertEquals(expectedResult, convertorTest.floatToChar(argA));
    }
}
