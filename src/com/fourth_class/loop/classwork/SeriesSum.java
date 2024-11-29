package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        variable declaration
        int n;
        float result=0.0f;

//        taking input from user
        System.out.println("Enter the value to sum series:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            result += (1.0f / i);
        }

//        displaying result:
        System.out.println("Series value is :" + result);
    }
}
