package com.company;

import javax.swing.*;

public class try_catch {
    public static void main(String[] args) {
//        exception mean error
        int a=2000;
        int b=0;
//without try
       int c;
       c=a/b;
        System.out.println("The result is :"+c);
//with try
        try {
           c=a/b;
           System.out.println("The result is :"+c);
       } catch (Exception e) {
           System.out.println("Division is not possible. Reason");
           System.out.println(e);
       }

    }
}
