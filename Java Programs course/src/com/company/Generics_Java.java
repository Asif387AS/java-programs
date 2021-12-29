package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//GENERICS
//here T1 and T1 are classes which are provided to another class
//this is also object or Data types
class myGeneric<T1,T2>{
    public int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val,T1 t1, T2 t2){
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }
}


public class Generics_Java {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add("str");
        arrayList.add(33);
//        arrayList.add(true);
        arrayList.add(44);
//     String a=(String)arrayList.get(0);
//     we have to type cast
     int b=(int)arrayList.get(1);
        System.out.println(b);

        myGeneric<Integer,String > m=new myGeneric<>(44,46,"tiddi");
      int d=  m.getT1();
        int e=m.getVal();
        String s=m.getT2();
        System.out.println(d+" "+e+" "+s);
    }
}
