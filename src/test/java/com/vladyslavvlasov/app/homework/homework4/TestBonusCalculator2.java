package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.BonusCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class TestBonusCalculator2 {
    @Test
    public void testIt() {
        double expectedResult = 200;
        BonusCalculator testBonus = new BonusCalculator();
        Assert.assertEquals(expectedResult, testBonus.countBonus(1000, 2), 0.0);
    }
}
