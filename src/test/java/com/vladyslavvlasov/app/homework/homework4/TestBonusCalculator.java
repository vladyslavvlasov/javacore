package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.BonusCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class TestBonusCalculator {
    @Test
    public void testIt() {
        double expectedResult = 100;
        BonusCalculator testBonus = new BonusCalculator();
        Assert.assertEquals(expectedResult, testBonus.countBonus(1000, 1), 0.0);
    }
}
