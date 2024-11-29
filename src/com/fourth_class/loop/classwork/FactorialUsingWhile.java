package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        variable declaration
        int input;

//        taking input from user

        System.out.println("Ënter value to calculate the factorial:");
        input = sc.nextInt();
        int result = 1;

//        manupulation for factorial

        while (true) {
            result *= input;
            input--;
            if (input == 0) {
                break;
            }
        }

//        displaying the result

        System.out.println("The factorial value  is " + result);
    }
}
