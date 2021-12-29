package com.company;

import java.sql.SQLOutput;
import java.util.Calendar; //it is abstract class
import java.util.GregorianCalendar; //it is concrete class
import java.util.TimeZone;

public class grogorian_calander {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR)+":"+ c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.getTime());

        System.out.println(TimeZone.getAvailableIDs(1));
        System.out.println(TimeZone.getAvailableIDs(2));
        System.out.println(TimeZone.getAvailableIDs(3));
    }
}
