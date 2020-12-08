package com.company;

public class ErrorHandling {
    public static void main( String[] args ) {
//        int number = 1.1;
//        System.out.println(name);
        printNumbers(10);
        System.out.println("Finish");
    }
    public static  void printNumbers(int limit){
        for (int i = 0; i < limit; i++ ){
            System.out.println(i);
        }
    }
}
