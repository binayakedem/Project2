package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class MinValueAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, min = 0, choice,val;

        while(true){

            System.out.println("0. Exit ");
            System.out.println("1. Proceed");
            System.out.println("2. Result");

            System.out.println("Enter your choice:");

            choice=sc.nextInt();
            if(choice==0){
                break;
            } else if (choice==1) {
                System.out.println("Enter value:");
                val=sc.nextInt();
                if(val>max){
                    max=val;
                }else {
                    min=val;
                }

            }else {
                System.out.println("Maximum value is:"+max);
                System.out.println("Minimum value is:"+min);
            }
        }

    }
}
