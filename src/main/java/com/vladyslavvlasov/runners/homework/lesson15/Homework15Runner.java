package com.vladyslavvlasov.runners.homework.lesson15;

import com.vladyslavvlasov.app.homework.lesson15.*;

import java.util.Scanner;

/**
 * Created by Murcielago on 26.11.2016.
 */
public enum Homework15Runner {
    A, B;

    public static void main(String[] args) {
        System.out.println("Please choose one of the following programs:");
        System.out.println("Enter \"a\" for Random Array runner");
        System.out.println("Enter \"b\" for Bycicle Program runner");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        try {
            Homework15Runner choice = Homework15Runner.valueOf(userInput.toUpperCase());
            switch (choice) {
                case A:
                    RandomArrayParametrized newObj = new RandomArrayParametrized(2);
                    RandomArrayParametrized newObj2 = new RandomArrayParametrized(3, 7);
                    newObj.create(newObj.a);
                    newObj2.create(newObj2.a, newObj2.b);
                    break;
                case B:
                    BicycleWithRingInterface interfaceObj = new BicycleWithRing();
                    interfaceObj.ring();
                    Bicycle bikeObj = new CustomBicycle();
                    bikeObj.setGear(6);
                    bikeObj.ride();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal choice. You should have entered either \"a\" or \"b\" ");
        }
    }
}
