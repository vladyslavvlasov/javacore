package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.BonusCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class TestBonusCalculator3 {
    @Test
    public void testIt() {
        double expectedResult = 300;
        BonusCalculator testBonus = new BonusCalculator();
        Assert.assertEquals(expectedResult, testBonus.countBonus(1000, 3), 0.0);
    }
}

