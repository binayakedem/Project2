package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        variable declaration
        int n;
        // Taking input
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
         n = sc.nextInt();

        // must greater than 0
        if (n <= 0) {
            System.out.println("Number of terms must be greater than 0.");
        } else {
            System.out.println("Fibonacci sequence:");
            int first = 0, second = 1; // Initial two numbers in the sequence

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " "); // Print the current Fibonacci number

                // Update the numbers
                int next = first + second;
                first = second;
                second = next;
            }
        }

    }
}
