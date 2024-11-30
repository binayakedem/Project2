package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//variable declaration
        int freOf0 = 0, freOf1 = 0, freOf2 = 0, freOf3 = 0, freOf4 = 0, freOf5 = 0, freOf6 = 0, freOf7 = 0, freOf8 = 0, freOf9 = 0, inputValue;

//        taking input from user to check the frequency
        inputValue = sc.nextInt();
        while (true) {
            int temp = inputValue % 10;// getting last digit
            inputValue = inputValue / 10;// removing last digit
            if (temp == 0) {
                freOf0++;// increment by 1 if true
            } else if (temp == 1) {
                freOf1++;
            } else if (temp == 2) {
                freOf2++;
            } else if (temp == 3) {
                freOf3++;
            } else if (temp == 4) {
                freOf4++;
            } else if (temp == 5) {
                freOf5++;
            } else if (temp == 6) {
                freOf6++;
            } else if (temp == 7) {
                freOf7++;
            } else if (temp == 8) {
                freOf8++;
            } else if (temp == 9) {
                freOf9++;
            } else {
                System.out.println();
            }
            if (inputValue == 0) {
                break;
            }
        }

        System.out.println("The frequency of 0 =" + freOf0);
        System.out.println("The frequency of 1 =" + freOf1);
        System.out.println("The frequency of 2 =" + freOf2);
        System.out.println("The frequency of 3 =" + freOf3);
        System.out.println("The frequency of 4 =" + freOf4);
        System.out.println("The frequency of 5 =" + freOf5);
        System.out.println("The frequency of 6 =" + freOf6);
        System.out.println("The frequency of 7 =" + freOf7);
        System.out.println("The frequency of 8 =" + freOf8);
        System.out.println("The frequency of 9 =" + freOf9);

    }
}
