package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.BonusCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class TestBonusCalculator4 {
    @Test
    public void testIt() {
        double expectedResult = 1000;
        BonusCalculator bonusTest4 = new BonusCalculator();
        Assert.assertEquals(expectedResult, bonusTest4.countBonus(1000, 10), 0.0);
    }
}
