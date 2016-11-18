package com.vladyslavvlasov.app.classwork.lesson14;

/**
 * Created by Murcielago on 16.11.2016.
 */
public class Bicycle {
    private int wheelSize;
    private String color;
    private int frameSize;
    private String brakestype;

    public Bicycle(int wheelSize, String color, int frameSize, String brakestype) {
        this.wheelSize = wheelSize;
        this.color = color;
        this.frameSize = frameSize;
        this.brakestype = brakestype;
    }

    public Bicycle() {
        this(26, "red", 20, "disk");
    }

    public Bicycle(int wheelSize) {
        this();
        this.wheelSize = wheelSize;
    }
}
