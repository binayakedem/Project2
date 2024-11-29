package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class CheckingPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        taking positive integer variable
        int num;

//        taking input
        System.out.println("Enter the value to check prime number:");
        while (true){
            num=sc.nextInt();
            if(num>0){
                break;
            }
            else {
                System.out.println("Enter positive integer!!");
            }
        }

//        checking whether the number is prime or not

        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("The given number is not prime");
                break;
            }else {
                System.out.println("The given number is prime");
                break;
            }
        }
    }
}
