package com.company;
import java.util.ArrayDeque;
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ArrayDeque<Integer> ad2=new ArrayDeque<>();

        ad1.add(4);
        ad1.add(5);
        ad1.add(6);
        ad1.addFirst(3);
        ad1.addLast(7);
        System.out.println(ad1);
        ad1.remove(5);
        ad1.removeFirst();
        ad2.addLast(44);
        ad1.offer(54);
        ad1.addAll(ad2);
//        ad1.removeLast();

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.getClass());
    }
}
