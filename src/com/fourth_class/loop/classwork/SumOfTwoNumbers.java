package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        variable declaration
        int num1,num2,result,choice;

//        while loop
        while(true){
            System.out.println("0. Exit");
            System.out.println("1. Continue");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            if(choice==0){
                break;
            }else {
                System.out.println("Enter the first number:");
                num1=sc.nextInt();
                System.out.println("Enter the second number:");
                num2=sc.nextInt();

//                displaying message
                System.out.println("Sum of two number is:"+(num1+num2));
            }

        }
    }
}
