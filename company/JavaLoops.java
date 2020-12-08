package com.company;

import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args){
//        while
//        while (condtion){
//            // block of the code
//        }
 //       int i = 0;
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }

//        do While
//        do {
//            // code block
//        }
//        while (condition);

//        do {
//            System.out.println(i);
//            i++;
//        } while (i > 5);


//        For Loop
//        for (int x = 0; x < 5; x++){
//            System.out.println(x);
//        }
//        for (int x = 0; x <= 10; x = x + 2){
//            System.out.println(x);
//        }

//        For Each
        String[] fruits = { "Apple", "Mango", "Orange"};
//        for (type variableName: arrayName){
//            //code block
//        }
//        for(int i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }
//        for (int i = fruits.length - 1; i >= 0; i--){
//            System.out.println(fruits[i]);
//        }
//
//        for(String fruit: fruits){
//            System.out.println(fruit);
//        }
// Break and Continue
        Scanner scanner = new Scanner(System.in);
        String input = "";

//        while (!input.equals("quit")){
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        while (!input.equals("quit")){
        while (true){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
