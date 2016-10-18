package com.vladyslavvlasov.app.homework.lesson4;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class BonusCalculator {

    private int positionLevel;
    private double salary;
    private double bonus;

    public void setSalary(double money) {
        salary = money;
    }

    public double getSalary() {
        return salary;
    }

    public void setPositionLevel(int lvl) {
        positionLevel = lvl;
    }

    public int getPositionLevel() {
        return positionLevel;
    }

    public double countBonus(double salary, int positionLevel) {
        if (positionLevel == 1) {
            bonus = salary * 0.1;
            System.out.println("Your bonus is " + bonus);
            return bonus;
        } else if (positionLevel == 2) {
            bonus = salary * 0.2;
            System.out.println("Your bonus is " + bonus);
            return bonus;
        } else if (positionLevel == 3) {
            bonus = salary * 0.3;
            System.out.println("Your bonus is " + bonus);
            return bonus;
        } else {
            System.out.println("Please enter position level from 1 to 3.Your current salary is " + salary);
            return salary;
        }
    }


}