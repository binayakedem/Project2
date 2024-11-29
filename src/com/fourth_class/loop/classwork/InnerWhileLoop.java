package com.fourth_class.loop.classwork;

public class InnerWhileLoop {
    public static void main(String[] args) {

//        printing Hello, this is while inner loop using while loop
//        loop counter
        int outerCount = 0;
        while (outerCount < 2) {
            outerCount++;
            int innerCount = 0;
            while (innerCount < 2) {
                System.out.println("Hello, this is while inner loop");
                innerCount++;
            }
        }

    }
}
