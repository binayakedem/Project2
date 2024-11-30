package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class FindingNtermSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        declaring variable
        int nTerm, n, result = 0, sum = 0;

//        taking input from user
        System.out.println("Enter the value to find nTerm sum:");
        nTerm = sc.nextInt();
        System.out.println("Enter the n term:");
        n = sc.nextInt();
//2+22+222

        for (int i = 0; i < n; i++) {
            result = (result * 10 + nTerm);
            sum += result;
        }
//        displaying result
        System.out.println(sum);
    }
}
