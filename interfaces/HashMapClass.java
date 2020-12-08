package com.interfaces;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
//        // HashMap:  key / value
//        HashMap<String, String> techList = new HashMap<String, String>();
//
//        techList.put("TechOne", "AI");
//        techList.put("TechTwo", "ML");
//        techList.put("TechThree", "DS");
//        techList.put("TechFour", "UI");
//        techList.put("TechFive", "API");
//
////        System.out.println(techList.remove("TechTwo"));
////        System.out.println(techList.size());
//        for (String tech: techList.keySet()){
//            System.out.println("Key: " + tech + ",  Value: " + techList.get(tech));
//        }

        //Creating a Hash map object callsed Product Prices
        HashMap<String, Integer> products = new HashMap<String, Integer>();
        products.put("Mobile", 15000);
        products.put("Laptop", 125000);
        products.put("Printer", 18000);
        products.put("Projector", 35000);

        for (String product: products.keySet()){
            System.out.println("Key: " + product + ",  Value: " + products.get(product));
        }

    }
}
