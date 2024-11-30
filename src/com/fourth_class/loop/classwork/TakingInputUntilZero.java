package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class TakingInputUntilZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        declaring variable
        int var=1;

//        taking input from user
        while(var==0){
            System.out.println("Enter number:");
            var=sc.nextInt();
    }
        System.out.println("Last time you enter number is:"+var);
    }
}
