package com.company;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
//        load factor : laod factor is those capacity on the base of which the hash table is doubl or increase its capacity
        HashSet<Integer> myHashSet=new HashSet<>(4,4f);
        //here are four techniques : hash map hash set,linked hash map , hash table
        //hash table is the array in which we storing the values
        myHashSet.add(44);
        myHashSet.add(41);  //work hash table  as 41%10=1 i it will store on index 1
        //to handle multiple value at same index we use opening (store the value on the next empty index)
        // and chaining techniques (make a node and store all values here )
        myHashSet.add(41); //duplicate value is not considered
        myHashSet.add(51); //duplicate value is not considered
//        myHashSet.clear();
        System.out.println(myHashSet);
        System.out.println(myHashSet.toString());
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet.stream());
        System.out.println(myHashSet.clone());

    }
}
