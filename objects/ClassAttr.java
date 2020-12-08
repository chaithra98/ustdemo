package com.objects;

public class ClassAttr {
    int x;
    int year;
    String modelName;

    public ClassAttr(int year, String modelName){
        this.modelName = modelName;
        this.year = year;
    }

    public static void main(String[] args){
        ClassAttr classAttr = new ClassAttr(2020, "Iphone10");
        System.out.println(classAttr.year + " " + classAttr.modelName);
    }
}
