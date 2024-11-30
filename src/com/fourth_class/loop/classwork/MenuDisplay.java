package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class MenuDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        declaring variable
        int counter=0,choice=1;
        System.out.println("1. Continue");
        System.out.println("2. Exit");
        while (choice!=2){  // terminates when user click the 2
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Continue");
                    System.out.println("2. Exit");
                    counter++;
                    break;
                case 2:
                    System.out.println("Total click of 1 is:"+counter);
                    break;
                default:
                    System.out.println("Invalid choice enter valid value");
            }
        }

    }
}
