package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.BonusCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class BonusCalculatorCountBonusTest {
    @Test
    public void testIt() {
        double expectedResult = 100;
        BonusCalculator testBonus = new BonusCalculator();
        Assert.assertEquals(expectedResult, testBonus.countBonus(1000, 1), 0.0);
    }
    @Test
    public void testIt2() {
        double expectedResult = 200;
        BonusCalculator testBonus = new BonusCalculator();
        Assert.assertEquals(expectedResult, testBonus.countBonus(1000, 2), 0.0);
    }
    @Test
    public void testIt3() {
        double expectedResult = 300;
        BonusCalculator testBonus = new BonusCalculator();
        Assert.assertEquals(expectedResult, testBonus.countBonus(1000, 3), 0.0);
    }
    @Test
    public void testIt4() {
        double expectedResult = 1000;
        BonusCalculator bonusTest4 = new BonusCalculator();
        Assert.assertEquals(expectedResult, bonusTest4.countBonus(1000, 10), 0.0);
    }
}
