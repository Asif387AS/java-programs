package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileWriter;
import java.io.IOException;


class myDeprecated{
    @Deprecated
    void add(){
        System.out.println("Adding ....");
    }
}
interface myInterface{
    public void meth();
}
public class advance_java2_practise {
    @SuppressWarnings(value = "Deprecation")
    public static void main(String[] args) {
        myDeprecated d = new myDeprecated();
        d.add();

        myInterface b = () -> {
            System.out.println("i am meth");
        };

        int i=7;
        String table="";
        for (int j = 0; j < 10; j++) {
            table+=i+" X "+ (j+1)+ "="+i*(j+1);
            table+="\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("multiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}