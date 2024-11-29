package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class CalculateHCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        declaring variable

        int firstNumber,secondNumber;

//        taking input from user
        System.out.println("Enter first number:");
        firstNumber=sc.nextInt();

        System.out.println("Enter second number:");
        secondNumber=sc.nextInt();

//        manupulation using euclidian
        while(secondNumber!=0){
            int temp=secondNumber;
             secondNumber=firstNumber%secondNumber;
             firstNumber=temp;
        }

//        displaying the result of hcf
        System.out.println("HCF value is:"+firstNumber);
    }
}
