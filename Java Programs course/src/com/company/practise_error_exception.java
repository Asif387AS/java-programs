package com.company;

import java.util.Scanner;

public class practise_error_exception {
    public static void main(String[] args) {
//        Problem 1
//        int i=2 sytax error
        int age=33;
        int born_year=200-33; //logical error

//        System.out.println(44/0); runtime error
        try {
            int e=44/0;
        }
        catch (ArithmeticException e){
            System.out.println("HaHaHa");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Hehehehe");
        }

//        problem 3
        boolean flag=true;
        int [] marks=new int[5];
        marks[0]=44;
        marks[1]=54;
        marks[2]=54;
        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.println("Enter the index no ");
                index=sc.nextInt();
                System.out.println("The valu of marks[index] : "+ marks[index]);
                break;
            }
              catch (Exception e){
                System.out.println("invalid index");
                   i++;
                              }
        }
        if (i>=5){
            System.out.println("Error");
        }
    }
}
