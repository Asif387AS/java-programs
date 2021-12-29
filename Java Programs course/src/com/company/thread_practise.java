package com.company;

import javax.swing.*;

class practiseThread  extends Thread{
    public void run(){
        int i=52;
//           System.out.println("thank u");
        while (true){
            System.out.println("Good Morning");
        }
    }
}
class practiseThread1 extends Thread{
    public void run(){
        int i=52;
//           System.out.println("thank u");
//        while (true){
//            System.out.println("Welcome");
//            try{
//                Thread.sleep(millis:333);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }

//        }
    }
}

public class thread_practise {
    public static void main(String[] args) {
        practiseThread p1=new practiseThread();
        practiseThread1 p2=new practiseThread1();
//        p1.setPriority(5);  //Max and Min priority
//        p2.setPriority(9);
//        System.out.println(p1.getPriority());   //--> Normal priority
//        System.out.println(p2.getPriority());
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState()); //with refernce get state of current thread
//        p1.start();



    }
}
