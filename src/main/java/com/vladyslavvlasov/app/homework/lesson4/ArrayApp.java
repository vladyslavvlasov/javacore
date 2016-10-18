package com.vladyslavvlasov.app.homework.lesson4;

/**
 * Created by Murcielago on 18.10.2016.
 */
public class ArrayApp {

    public String[] klych = {"Slava Ukraini", "Slava Nazii", "Ukraina"};
    public String[] vidpovid = {"Heroyam Slava", "Smert Vorogam", "Ponad use"};

    public String[] returnKlych(int number) {
        System.out.println(klych[number] + " " + vidpovid[number]);
        return new String[]{klych[number],vidpovid[number]} ;
    }
}
