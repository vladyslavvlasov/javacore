package com.vladyslavvlasov.runners.homework.lesson16;

import com.vladyslavvlasov.app.homework.lesson16.GuessGame;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Murcielago on 27.11.2016.
 */
public class Homework16Runner {
    public static void main(String[] args) {
        GuessGame[] namesArr = GuessGame.values();
        int guessIndex;
        int count = 0;
        while (true) {
            guessIndex = (int) (Math.random() * namesArr.length);
            System.out.println("You have to guess death status of person and their age 2 times to finish the game");
            System.out.println("Please guess if the next this person is dead: " + namesArr[guessIndex].getName());
            System.out.println("Type \"true\" if the person is dead and \"false\" if the person is alive");
            Scanner scanner = new Scanner(System.in);
            Boolean input = scanner.nextBoolean();
            if (input.equals(namesArr[guessIndex].getDeathStatus())) {
                System.out.println("Right guess! Now please choose the age(Options are: 53, 86, 58, 82, 75).");
                int ageInput = scanner.nextInt();
                if (ageInput == namesArr[guessIndex].getAge()) {
                    count += 1;
                    if (count == 2) {
                        System.out.println("Congrats! You've won");
                        System.exit(0);
                    } else {
                        System.out.println("Right guess! Your guess count is " + count + ". Let's continue with a next person");
                        System.out.println();
                    }
                } else {
                    System.out.println("Oops, wrong guess. Your guess count is " + count + ". Let's continue with a next person");
                    System.out.println();
                }
            } else {
                System.out.println("Oops, wrong guess. Your guess count is " + count + ". Let's continue with a next person");
                System.out.println();
            }
        }
    }
}
