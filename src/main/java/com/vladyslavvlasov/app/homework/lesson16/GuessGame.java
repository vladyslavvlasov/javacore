package com.vladyslavvlasov.app.homework.lesson16;

import java.lang.reflect.Array;

/**
 * Created by Murcielago on 27.11.2016.
 */
public enum GuessGame {
     MICHAEL_JORDAN(53,false,"Michael Jordan"),CLINT_EASTWOOD(86,false, "Clint Eastwood"),MADONNA(58, false, "Madonna"),LEONARD_COHEN(82, true, "Leondard Cohen"), BOB_DYLAN (75, false, "Bob Dylan");

private GuessGame(int age, boolean dead,String name){
    this.age=age;
    this.dead=dead;
    this.name=name;
}

    private int age;
    private boolean dead;
    private String name;
    private String[] namesArr = new String[5];

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getDeathStatus(){
        return dead;
    }

}
