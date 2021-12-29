//package com.company;
//First method to create threads in java
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while (i<500){
            System.out.println("My Cooking thread1 is running");
        System.out.println("I am Happy");
        i++;
    }}

}class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while (i<500){
        System.out.println("My Chatting thread2 is running");
        System.out.println("I am sad");
        i++;
    }}
}
public interface creating_thread_multihreading {
    public static void main(String[] args) {
MyThread1 t1=new MyThread1();
MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
