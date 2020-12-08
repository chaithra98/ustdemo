package com.company;

public class Operators {
    public static void main(String[] args){
//        int x = 100 + 10;
//        int sum2 = 100;
//        int sum3 = sum2 + 50;
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
        //Implicit Casting or Widening Casting (automatically)
        // converting small types to larger type size
        // byte > short > int > long > float > double
//        double x = 1.1;
//        double y = x + 2;
        //Explicit casting or Narrowing Casting (manually)
        // Converting larger type to smaller size type
//        double x = 1.1;
//        int y = (int)x + 2;
//        System.out.println(y);

        //parse
//        String x = "5";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);
        // operators priority
//        int x = (10 + 3) * 2;
//        System.out.println(x);
//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2;

//        int x = 1;
//        int y = 1;
//
//        System.out.println( x | y);

        int temperature = 22;

        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
    }
}
