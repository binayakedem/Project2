package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class InputCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        this counts the number of input user provided
        int input=1,counter=0;
        System.out.println("0.Exit");
        while(input!=0){
            System.out.println("Enter value:");
            input=sc.nextInt();
            counter++;
        }
        System.out.println("You click number "+counter +" times");
    }
}
