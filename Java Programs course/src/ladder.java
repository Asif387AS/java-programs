package com.company;
import java.util.Scanner;
public class ladder {
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        switch (age)
        {
            case 3:
                System.out.println("you are mature enough");
                break;
            case 55:
                System.out.println("your are very experienced");
                break;
            case 88:
                System.out.println("your are very old");
                break;
            default:
                System.out.println(" sorry your are a baby");
        }
        System.out.println(" try aggin later for your birth");
       /* if(age>20&&age<30)
            System.out.println("you are mature Enough");
        else if(age>30 && age<50)
            System.out.println("you are very mature Enough");
        else
            System.out.println("you are Experienced");*/
    }
}
