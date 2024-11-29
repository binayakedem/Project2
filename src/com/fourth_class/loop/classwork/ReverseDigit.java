package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        declarring variable

        int value, result = 0;
//        taking input from user base value and power

        System.out.println("Enter the integer value for reverse:");
        value = sc.nextInt();

        while (true) {
            int digit = 0;
            digit = value % 10;  // this line gives the last digit and store in digit variable
            value = value / 10;  // this line makes one digit reduced
            result = result * 10 + digit; // this actually last digit with 0 so whenevever added to another one then at the last always digit is add as normal 60+9 mean 69
            if (value == 0) {
                break; // when value become 0 then break the loop
            }

        }


//displaying the message
        System.out.println("Reverser value is :" + result);
    }
}
