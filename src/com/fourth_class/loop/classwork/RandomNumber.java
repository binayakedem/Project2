package com.fourth_class.loop.classwork;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

//        random number generator between 0-100
        int randomNumber = random.nextInt(100) + 1;
//        variable declaration
        int userGuess = 0;

        System.out.println("Enter the value starting from 0 to 30 and if correct program will be terminated:");

        // loop terminate in case of rand==guess value
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number: " + randomNumber);
            }
        }
    }
}
