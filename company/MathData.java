package com.company;

import java.text.NumberFormat;

public class MathData {
    public static void  main(String[] args){
//        int result = Math.round(1.1f);
//        int result = (int)Math.ceil(1.1f);
//        int result = (int)Math.floor(1.1f);
//        int result = Math.max(1, 2);
//        double result = Math.random();
//        double result = Math.random() * 100;
//        int result = (int)Math.round(Math.random() * 100);
        // Ref type Number Format
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(12345680.891);

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(12345680.891);

        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
