package com.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorClass {
    public static void main(String[] args) {

        ArrayList<String> tools = new ArrayList<String>();
        tools.add("JAVA");
        tools.add("AZURE");
        tools.add("SPRING");
        tools.add("AZURE");
        tools.add("MONGODB");
        tools.add("MTLS");
        tools.add("JAVA");

        //Get the iterator
        Iterator<String> itr = tools.iterator();

//        System.out.println(itr.next()); // Frist item
//        System.out.println(itr.next()); // Second Item
//        System.out.println(itr.next()); // Third Item
//        System.out.println(itr.hasNext());

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
