package com.company;

import java.awt.*;
import java.util.Locale;

public class stringmethod {
    public static void main(String[] args) {
        String name ="        asif ali";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String st= name.toUpperCase();
        System.out.println(st);
        String stt= name.toLowerCase(Locale.ROOT);
        System.out.println(stt);
        String sttt= name.trim();
        System.out.println(sttt);
        String sub= name.substring(10);
        //System.out.println(name.substring(10));
        System.out.println(sub);
        String sub2= name.substring(1,10);
        System.out.println(sub2);
        System.out.println(name.replace('s','p'));
        System.out.println(name.replace("as","P"));
        Boolean start= name.startsWith("as");
        System.out.println(start);
        Boolean end= name.endsWith("li");
        System.out.println(end);
        System.out.println(name.charAt(8));
        String mod= "dhasifalikodhan";
        System.out.println(mod.indexOf("a"));
        System.out.println(mod.indexOf("ali",3));
        System.out.println(mod.lastIndexOf("dh",'0'));
        System.out.println(mod.equals("dhasifalikodhan"));
        System.out.println(mod.equalsIgnoreCase("DHASIFALIKODHAN"));
        System.out.println("hi i am asif ali \r kodhan jutt \' ");
   }
}
