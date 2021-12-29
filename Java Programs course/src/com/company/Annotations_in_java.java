package com.company;
@FunctionalInterface  //only conatin one abstract method
interface functionalInterface{
    public void myMethod();
//    public void myMethod2();
}
class phone{
    //    Dynamic Method dispatich or run time polymorphism
    public void showTime()
    {
        System.out.println("time noe 1:32 pm");
    }
    public void on()
    {
        System.out.println("turning on the phone");
    }
}
class myPhone extends phone{
    @Deprecated  //function is deprecated
    public int add(int i, int b){
        return i+b;
    }
    @Override //This is override annotation
    public void showTime(){
        System.out.println("time is now 1:32 am");
    }


}

public class Annotations_in_java {
@SuppressWarnings("deprecation") //to overcome the warnings
    public static void main(String[] args) {

        myPhone m=new myPhone();
        m.showTime();
     int a=m.add(4,4);
        System.out.println(a);
    }
}
