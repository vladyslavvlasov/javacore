package com.vladyslavvlasov.runners.homework4;

import com.vladyslavvlasov.app.homework.lesson4.BonusCalculator;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class BonusCalculatorRunner {
    public static void main(String[] args) {
        BonusCalculator bonusCalc = new BonusCalculator();
        bonusCalc.setPositionLevel(1);
        bonusCalc.setSalary(1000);
        double salary = bonusCalc.getSalary();
        int positionLevel = bonusCalc.getPositionLevel();
        bonusCalc.countBonus(salary, positionLevel);

    }
}


