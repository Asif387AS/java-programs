package com.company;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Practise_Set_collection1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
//        PS:1
        a.add("asif");
        a.add("kashif");
        a.add("Saqib");
        a.add("Tayyab");
        a.add("Sabar");
        a.add("Tiddi");
        a.add("Shabo");
        a.add("Sadaf");
        a.add("Honey Bee");
        a.add("Hassan");
        a.add("Adeel");
        for (Object o:a) {
            System.out.print(o);
            System.out.print(":");
        }
        System.out.println("");
//        PS5
        HashSet<Integer> h=new HashSet<>();
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(7);
//        System.out.println(s);
        for (Object o:h) {
            System.out.println(o);
        }

//        PS:2
        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
//        PS3
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+ c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

//        PS:4
        LocalDateTime dt=LocalDateTime.now();
//        System.out.println(dt);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("H:m:s ");
        DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String myDate=dt.format(df);
        System.out.println(myDate);
    }

}
