package com.company;
class myThr2 extends Thread{
    public myThr2(String name) {
        super(name);
    }
    public void run(){
        int i=52;
//           System.out.println("thank u");
            while (true){
                System.out.println("I am thread" + this.getName());
            }
    }
}
public class thread_priority {
    public static void main(String[] args) {
//        Read Queue : t1,t2,t3,t4,t5
        myThr2 t1=new myThr2("asif1");
        myThr2 t2=new myThr2("asif2");
        myThr2 t3=new myThr2("asif3");
        myThr2 t4=new myThr2("asif4");
        myThr2 t5=new myThr2("asif5 (the most important thread)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
