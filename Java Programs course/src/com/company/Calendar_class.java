package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class Calendar_class {
    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTime());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getTimeZone().getID());

        Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/faisalabad"));
//        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
//        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getFirstDayOfWeek());



    }
}
