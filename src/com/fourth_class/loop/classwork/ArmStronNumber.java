package com.fourth_class.loop.classwork;

public class ArmStronNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500 are:");
        // Iterate through numbers from 1 to 500
        for (int number = 1; number <= 500; number++) {
            int sum = 0;
            int temp = number;

            // Calculate the sum of cubes of digits
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp = temp / 10;
            }

            // Check if the sum of cubes is equal to the original number
            if (sum == number) {
                System.out.println(number); // Print Armstrong number
            }
        }
    }}
