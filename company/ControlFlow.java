package com.company;

public class ControlFlow {
    public static void main(String[] args){
        //Java Conditions & If Statements
        // if, else, else if, switch
        // Syntax
//        if(condition){
//            //block of code
//        }
//        int x = 10;
//        int y = 18;
//
//        if (x > y) {
//            System.out.println("X is greater than y");
//        } else {
//            System.out.println("X is not greater than y");
//        }

//        int time = 22;
//        if (time < 10) {
//            System.out.println("Good Morning");
//        } else if (time < 20) {
//            System.out.println("Good Day");
//        } else {
//            System.out.println("Good Evening");
//        }
        // format if
//        int time = 22;
//        if (time < 10) {
//            System.out.println("Good Morning");
//        }
//        else if (time < 20)
//            System.out.println("Good Day");
//        else
//            System.out.println("Good Evening");

        // simplify if
//        int income = 400_000_000;
//        boolean hasHighIncome = (income > 200_000);
//        System.out.println(hasHighIncome);

        // Ternary Operator
        //variable = (condition) ? expressionTrue : expressionFalse;

//        int time = 20;
//        String result = (time < 18) ? "Good Day..." : "Good Evening...";
//        System.out.println(result);
//        switch (expression){
//            case  x:
//                //code block
//                break;
//            case  y:
//                //code block
//                break;
//            default:
//                //code block
//        }

        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
