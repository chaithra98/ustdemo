package com.company;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Int input
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();

        //String Input
        System.out.print("Name: ");
//        String name = scanner.next();
        String name = scanner.nextLine().trim();
        System.out.println("You Are: " + name);
    }
}
