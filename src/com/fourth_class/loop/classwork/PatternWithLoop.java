package com.fourth_class.loop.classwork;

import java.util.Scanner;

public class PatternWithLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        declaration of variable
/*
*               1
*               222
*               33333
*               4444444
*               555555555
*
* */
      for(int i=1;i<=5;i++){
          for(int j=1;j<=((2*i)-1);j++){
              System.out.print(i);
          }
          System.out.println();
      }

    }
}
