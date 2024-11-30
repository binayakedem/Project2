package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
//        finding the largest digit among the digit of integer

        Scanner sc=new Scanner(System.in);

//        declaring variable

        int value,largest=-999;

//        taking input from use
        System.out.println("Enter value to find largest digit:");
        value=sc.nextInt();
        int keepOriginalValue=value;
        while(true){
            int temp=value%10;
            value=value/10;
            if(temp>largest){
                largest=temp;
            }
            if(value==0){
                break;
            }
        }

//        displaying largest digit
        System.out.println("Largest digit among " +keepOriginalValue+ " is"+largest);

    }
}
