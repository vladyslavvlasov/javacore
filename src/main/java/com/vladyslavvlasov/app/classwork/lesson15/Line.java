package com.vladyslavvlasov.app.classwork.lesson15;

/**
 * Created by Murcielago on 19.11.2016.
 */
public class Line {
    private Pixel [] line = new Pixel[2];
    public Line(Pixel pix1, Pixel pix2){
        this.line[0]=pix1;
        this.line[1]=pix2;
    }
    public void addPix(Pixel pix){
        Pixel[] newLine =new Pixel[line.length+1];
        for (int i =0; i <line.length;i++){
            newLine[i]=line[i];
        }
        newLine[newLine.length-1] =pix;
        line =newLine;
    }
}
