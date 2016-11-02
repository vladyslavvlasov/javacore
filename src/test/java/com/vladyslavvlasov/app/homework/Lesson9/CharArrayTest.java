package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.classwork.lesson9.CharArray;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 01.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CharArrayTest {
    @Test
    @FileParameters(value="src/test/resources/chararraydata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testIfCharacterIsRight(int argA, char expectedResult){
        CharArray newObject = new CharArray();
        Assert.assertEquals(expectedResult,newObject.createCharArray()[argA]);
    }
    @Test
    public void testLengthOfCharArray(){
        CharArray newObj= new CharArray();
        int expectedResult=256;
        Assert.assertEquals(expectedResult,newObj.createCharArray().length);
    }
}
