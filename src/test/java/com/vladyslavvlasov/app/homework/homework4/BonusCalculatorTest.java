package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.BonusCalculator;
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
public class BonusCalculatorTest {
    @Test
    @FileParameters(value = "src/test/resources/bonuscalculatordata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testBonusCalculator(double argA, int argB, double expectedResult) {
        BonusCalculator testBonus = new BonusCalculator();
        Assert.assertEquals(expectedResult, testBonus.countBonus(argA, argB), 0.0);
    }

    @Test
    public void testSalaryGetters() {
        BonusCalculator testObj = new BonusCalculator();
        double expectedResult = 1;
        testObj.setSalary(expectedResult);
        Assert.assertEquals(expectedResult, testObj.getSalary(), 0.0);
    }

    @Test
    public void testPositionGetters() {
        BonusCalculator testObj = new BonusCalculator();
        int expectedResult = 1;
        testObj.setPositionLevel(expectedResult);
        Assert.assertEquals(expectedResult, testObj.getPositionLevel());
    }
}
