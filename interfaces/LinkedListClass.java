package com.interfaces;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        //LinkedList
        // addFirst()
        // addLast();
        // removeFirst();
        // removeLast();
        // getFirst();
        // getLast();

        LinkedList<String> tools = new LinkedList<String>();

        tools.add("JAVA");
        tools.add("SPRING");
        tools.add("AZURE");
        tools.add("MONGODB");
        tools.add("MTLS");

        tools.addFirst("API");
        tools.addLast("PMB");

        System.out.println(tools);
    }
}
