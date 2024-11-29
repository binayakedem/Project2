package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        declarring variable
        int value, size, sumOfOdd = 0, sumOfEven = 0;
        System.out.println("Enter the size of inputs:");
        size = sc.nextInt();

//        looping to take input

        for (int i = 0; i < size; i++) {
            value = sc.nextInt();
            if(value%2==0){
                sumOfEven+=value;
            }else {
                sumOfOdd+=value;
            }

        }
//        displaying message about the sum of even and odd
        System.out.println("Sum of Even: "+sumOfEven);
        System.out.println("Sum of Odd: "+sumOfOdd);

    }
}
