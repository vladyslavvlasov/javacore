package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson7.ArrayFrom1to99;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 30.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class ArrayFrom1to99Test {
    @Test
    public void testArrayFrom1To99(){
        int expectedResult=50;
        ArrayFrom1to99 newObject = new ArrayFrom1to99();
        Assert.assertEquals(expectedResult,newObject.createArrayFrom1to99().length);
    }
    @Test
    @FileParameters(value = "src/test/resources/arrayfrom1to99data.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testIfArrayHasRightNumber(int argA, int expectedResult){
        Assert.assertEquals(expectedResult,ArrayFrom1to99.createArrayFrom1to99()[argA]);
    }
}
