package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class PowerForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        declarring variable

        int value,pow;
//        taking input from user base value and power

        System.out.println("Enter the base value:");
        value=sc.nextInt();

        System.out.println("Enter the power value:");
        pow=sc.nextInt();
        int result=1;
        for(int i=0;i<pow;i++){
           result *=value;
        }
//displaying the message

        System.out.println("Result is :"+result);
    }
}
