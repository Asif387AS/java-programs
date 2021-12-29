package com.company;

import java.util.Scanner;

public class try_catch_nested {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=33;
        marks[1]=35;
        marks[2]=43;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        while (flag){
        System.out.println("Enter the index :");
        int index=sc.nextInt(); 
//            System.out.println("The value is :"+ marks[index]);


     try {
         System.out.println("Welcome to video no 82");
         try {
             System.out.println(marks[index]);
             flag=false;
         }
         catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Sorry this index not exist");
             System.out.println("Exception at level 2");
         }
     }
     catch (Exception e){
         System.out.println("Exception in level 1");
     }
        }
        System.out.println("Thanks for using this program");
    }
}
