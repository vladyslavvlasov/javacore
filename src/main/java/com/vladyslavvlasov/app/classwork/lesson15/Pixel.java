package com.vladyslavvlasov.app.classwork.lesson15;

/**
 * Created by Murcielago on 19.11.2016.
 */
public class Pixel {
    private int x;
    private int y;
    public Pixel(int x, int y){
        this.x = x;
        this.y =y;
    }
    public int[] getCoordinates(){
        int[]res ={x,y};
        return res;
    }

    public static void main(String[] args) {
        Pixel pixel = new Pixel(10,20);
        int[] pixelCoordinates = pixel.getCoordinates();
    }
}
