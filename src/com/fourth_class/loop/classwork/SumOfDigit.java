package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//    variable declaration
        int digits, result = 0;

//    taking input from user
        System.out.println("Enter the digit value to calculate the sum:");
        digits = sc.nextInt();
        while (true) {
            int temp = digits % 10;
            result += temp;
            digits = digits / 10;
            if(digits==0){
                break;
            }

        }

        System.out.println("Sum of digit is:" + result);
    }
}
