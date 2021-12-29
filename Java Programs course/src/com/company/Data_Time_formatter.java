package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data_Time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/mm/yyyy --E H:m a ");
        DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String myDate=dt.format(df);
        System.out.println(myDate);
    }
}
