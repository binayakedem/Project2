package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter the value to calculate the table:");
        input = sc.nextInt();
//        displaying table
        System.out.println("This si the for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(input + "*" + i + "=" + (input * i));
        }

        int i=1;
        System.out.println("This is using the while loop:");
        while(i<=10){
            System.out.println(input + "*" + i + "=" + (input * i));
            i++;
        }
    }
}
