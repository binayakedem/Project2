package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//    declaration of variable
        int value, reverse = 1;

//    taking input from user to check whether the given number is palindrome or not
        System.out.println("Enter the value to check palindrome:");
        value = sc.nextInt();

//        reverse the number
        while (value == 0) {
            int temp = value % 10;
            reverse += reverse * 10 + temp;
            value /= 10;
        }

        if (reverse == value) {
            System.out.println("The given number is palindrome" + reverse);
        } else {
            System.out.println("The given number is not palindrome");

        }
    }
}
