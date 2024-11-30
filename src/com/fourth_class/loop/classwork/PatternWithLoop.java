package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class PatternWithLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * ******
         * ******
         * ******
         * ******
         * ******
         * ******
         * ******
         * */

        System.out.println("This is square");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * *
         * **
         * ***
         * ****
         * *****
         *
         * */
        System.out.println("This is type of triangle");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        declaration of variable
        /*
         *               1
         *               222
         *               33333
         *               4444444
         *               555555555
         *
         * */
        System.out.println("This is type of triangle with numbers");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        /*
         * *
         * **
         * ***
         * ****
         * *****
         * ****
         * ***
         * **
         * *
         * */
        System.out.println("THis is type of triangle ");
        for (int i = 1; i <= 9; i++) {
            int stars = (i <= 5) ? i : (10 - i); // Determine the number of stars

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * 1
         * 212
         * 32123
         * 4321234
         * 543212345

         * */

        int size;
        System.out.println("Enter the size of the pattern:");
        size = sc.nextInt(); //4
        for (int i = 1; i <= size; i++) {
            for (int l = size; l > i; l--) { //4-1=3 //
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);//2 1 decrement
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);// 2  increment
            }
            System.out.println();
        }



        /*
         * 1
         * 222
         * 33333
         * 4444444
         * 555555555
         *
         *
         * */


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        /*
         *             *
         *            ***
         *           *****
         *          *******
         *         *********
         *          *******
         *           *****
         *            ***
         *             *
         * */
        // Upper part (including the middle row)
     int n=3;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
