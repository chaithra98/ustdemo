package com.interfaces;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        //HashSet
        HashSet<String> tools = new HashSet<String>();
        tools.add("JAVA");
        tools.add("SPRING");
        tools.add("AZURE");
        tools.add("MONGODB");
        tools.add("AZURE");
        tools.add("MTLS");
        tools.add("JAVA");

        //System.out.println(tools.remove("JAVA"));
        //tools.clear();
        //System.out.println(tools);
        for (String tool : tools){
            System.out.println(tool);
        }
    }
}
