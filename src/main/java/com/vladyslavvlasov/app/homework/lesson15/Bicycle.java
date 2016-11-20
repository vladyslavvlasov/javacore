package com.vladyslavvlasov.app.homework.lesson15;

/**
 * Created by Murcielago on 20.11.2016.
 */
public abstract class Bicycle {
    public abstract void setGear(int gear);
    public abstract void setSpeed(int speed);
    public void ride(){
        System.out.println("Wroom!");
    }
}
