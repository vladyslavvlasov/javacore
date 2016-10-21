package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.Msg1;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Murcielago on 13.10.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class Msg1CompareMessagesTest {
    @Test
    @FileParameters(value = "src/test/resources/msg1data.csv",
            mapper = CsvWithHeaderMapper.class)
    public void getTestData(String argA, String expectedResult) {

        Msg1 testmessage = new Msg1();

        assertEquals(expectedResult, testmessage.msg1(argA));
    }

}
