package com.company;

import java.util.Scanner;

public class handling_specific_exception {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=33;
        marks[1]=35;
        marks[2]=43;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index number");
        int indx=sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number=sc.nextInt();
        try {
            System.out.println("The value at array index entered is:" + marks[indx]);
            System.out.println("The value of arr-index/number is :" + marks[indx]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occoured");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic Exception occoured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other Exception occoured");
            System.out.println(e);
        }

    }
}
