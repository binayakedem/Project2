package com.fourth_class.loop.classwork;

public class DoWhileInner {
    public static void main(String[] args) {

//        using do while of inner to print “Hello, this is do while inner loop”
        int outerCount = 0;
        do {
            int innerCount = 0;
            do {
                System.out.println("Hello, this is do while inner loop");
                innerCount++;
            } while (innerCount < 4);
            outerCount++;
        } while (outerCount < 4);
//        above print 16 times first inner loop prints four times when outer loop is once
    }
}
