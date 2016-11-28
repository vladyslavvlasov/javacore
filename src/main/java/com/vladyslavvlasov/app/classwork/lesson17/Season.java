package com.vladyslavvlasov.app.classwork.lesson17;

import java.util.Arrays;

/**
 * Created by Murcielago on 26.11.2016.
 */
public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    public static void main(String[] args) {
        try {
            Season season = Season.valueOf("SPRING");
            switch (season) {
                case SPRING:
                    System.out.println(season.toString());
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season selection");
        }
    }
}
