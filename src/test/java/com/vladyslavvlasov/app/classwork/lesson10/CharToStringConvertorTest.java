package com.vladyslavvlasov.app.classwork.lesson10;

import com.vladyslavvlasov.app.classwork.lesson9.CharArray;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 04.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class CharToStringConvertorTest {
    @Test
    public void testIfCharConvertsCorrectly(){
        CharToStringConvertor newObj = new CharToStringConvertor();
        char[] newCharArr ={'5','6','-'};
        String expRes ="56-";
        Assert.assertEquals(expRes,newObj.convertCharToString(newCharArr));
    }
}
