package com.company;

import java.util.Scanner;

public class asif {

    public static  void main(String[] args)

    {
        Scanner asif= new Scanner(System.in);
        System.out.println("enter the marks of english:");
        int english= asif.nextInt();
        System.out.println("enter the marks of computer:");
        int computer= asif.nextInt();
        System.out.println("enter the marks of math:");
        int math= asif.nextInt();
        System.out.println("enter the marks of urdu:");
        int urdu= asif.nextInt();
        System.out.println("enter the marks of chemistory:");
        int chemi= asif.nextInt();
        float perc=((english+computer+math+urdu+chemi/500.0f)*100);
        System.out.println("percentage is =");
        System.out.println(perc);

}



    }
