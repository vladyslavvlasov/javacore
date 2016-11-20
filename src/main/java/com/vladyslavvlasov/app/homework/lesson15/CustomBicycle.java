package com.vladyslavvlasov.app.homework.lesson15;

/**
 * Created by Murcielago on 20.11.2016.
 */
public class CustomBicycle extends Bicycle {

    private int speed;
    private int gear;


   public void setGear(int gear) {
this.gear=gear;
        System.out.println("Gear has been set to "+ this.gear);
    }

    public void setSpeed(int speed) {
        this.speed =speed;
        System.out.println("Speed has been set to "+ this.speed);
    }
    public void ride(){
        System.out.println("Wshhhh!");
    }
}
