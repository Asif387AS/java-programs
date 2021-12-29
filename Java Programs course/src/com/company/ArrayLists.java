package com.company;
import java.util.*;
public class ArrayLists<B> {
    public static void main(String[] args) {
        System.out.println("i am asif");
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>('6');
        l2.add(44);
        l2.add(45);
        l2.add(46);
        l1.add(47);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(0,1 );
        l1.add(0,2  );
        l1.addAll(l2);
//        l1.clear();
        l1.set(0,4444);
//        System.out.println(l1.isEmpty());
        System.out.println(l1.iterator());
        l1.ensureCapacity(3);
//        System.out.println(l1.contains(4));
//        System.out.println(l1.indexOf(5));
//        System.out.println(l1.lastIndexOf(46));
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
