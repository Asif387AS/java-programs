package com.company;
class myThr3 extends Thread{
  public void run(){
        int i=0;
//           System.out.println("thank u");
        while (i<60){
            System.out.println("I am thread");
//            try{
//                Thread.sleep(long millis:55);
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
            }  i++;
        }
    }
//}
class myThr4 extends Thread{
    public void run(){
        int i=52;
//           System.out.println("thank u");
        while (i<60){
            System.out.println("This is not a thread ");
        }
    }
}

public class thread_method {
    public static void main(String[] args) {
myThr3 t=new myThr3();
myThr4 t1=new myThr4();
t.start();
//try{
//    t.join();
//}
//catch(Exception e){
//
//            System.out.println(e);
//        }
t1.start();

    }
}
