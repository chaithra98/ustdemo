package com.interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateClass {
    public static void main(String[] args) {
	   //System.out.println(myConst);
        // Patterns
        // yyyy-MM-dd   2020-12-03
        // dd/MM/yyyy   03/12/2020
        // dd-MMM-yyyy  03-DEC-2020
        // E, MMM dd yyyy "Thu, Dec 03, 2020"

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = localDate.format(formatObj);
        System.out.println("Before Format: " + localDate);
        System.out.println("After Format: " + formattedDate);
    }
}
