package com.company;

public class MethodsJava {

    public static void main(String[] args) {
        int x = 10;
//        greetUser("venkat");
//        greetUser("Jithin");
//        greetUser("Deepak");
        //myMethod();
//        helloUser("venkat", 28);
//        helloUser("Deepak", 21);
//        helloUser("Akhil", 22);
        //int y = sum(5);
        //System.out.println(sum(5));
        //checkGrade(81);

//        int plusValue = plusMethod(10, 8);
//        double doubleValue = plusMethodDouble(4.5, 5.4);
        int plusValue = calc(10, 8);
        double doubleValue = calc(4.5, 5.4);

//        System.out.println("Int: " + plusValue);
//        System.out.println("Double: " + doubleValue);

//        // here code can't access z
//        {
//            int z = 10;
//
//        }
        int res = rec(10);
        System.out.println(res);
    }

    //recursive function
    public static int rec(int k){
        if (k > 0) {
            return k + rec(k -1);
        } else {
            return 0;
        }
    }
//    10 + rec(9)
//    10 + (9 + rec(8))

    //method overloading
    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    static int calc(int x, int y){
        return x + y;
    }

    static double calc(double x, double y){
        return x + y;
    }

    static void checkGrade(int grade){
        //if grade is less than 60, not eligible for job
        if(grade < 60 ) {
            System.out.println("Sorry you are not eligible for job");
        } else {
            System.out.println("Congrats you are eligible for job");
        }
    }

    static int sum( int x) {
        return 5 + x;
    }

    public static void helloUser(String name, int age) {
        System.out.println(name + " is " + age);
    }

    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    static void myMethod() {
        System.out.println("This is a function");
    }

}
