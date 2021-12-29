package com.company;
import java.util.Scanner;
import java.util.Random;
public class exercise2 {
    public static void main(String[] args) {
        //rock for 0
        //paper for 1
        // scissor for 2
        Scanner sc= new Scanner(System.in);
        System.out.println("0 for rock 1 for paper 2 for seasor");
        int userInput= sc.nextInt();

        Random ran=new Random();
        //int bound;
        int computeInput=ran.nextInt(3);

        if (userInput==computeInput)
        {
            System.out.println("Draw");
        }
else if(userInput==0 && computeInput==2 || userInput==1 && computeInput==0 || userInput== 20&& computeInput==1)
        {
            System.out.println("You Win");
        }
else {
            System.out.println("computer Win");
        }


if(computeInput==0)
{
    System.out.println("computer choice is rock");
}
    else if (computeInput==1)
{
    System.out.println("computer choice is paper");


}
    else if(computeInput==2){
    System.out.println("computer choice is scissor");
}
}

    }

