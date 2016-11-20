package com.vladyslavvlasov.runners.lesson15;

import com.vladyslavvlasov.app.homework.lesson15.*;

import java.util.Scanner;

/**
 * Created by Murcielago on 20.11.2016.
 */
public class Homework15Runner {
    public static void main(String[] args) {
        System.out.println("Please choose one of the following programs:");
        System.out.println("1.Random Array runner");
        System.out.println("2. Bycicle Program runner");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                RandomArrayParametrized newObj = new RandomArrayParametrized(2);
                RandomArrayParametrized newObj2 = new RandomArrayParametrized(3, 7);
                newObj.create(newObj.a);
                newObj2.create(newObj2.a, newObj2.b);
                break;
            case 2:
                BicycleWithRingInterface interfaceObj = new BicycleWithRing();
                interfaceObj.ring();
                Bicycle bikeObj = new CustomBicycle();
                bikeObj.setGear(6);
                bikeObj.ride();
        }
    }
}
