package com.company;

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return "i am toString";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";
    }
}


class makeAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the age entered is correct";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        a=sc.nextInt();
        if (a<99){
            try {
//                throw new Exception();
                throw new ArithmeticException("I am exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.getStackTrace();
                System.out.println(e);
            }


        }
    }
}
