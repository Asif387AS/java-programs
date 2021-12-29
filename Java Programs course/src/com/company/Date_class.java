package com.company;

import javax.xml.crypto.Data;
import java.util.Date;

public class Date_class {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getMonth());

   }
}
