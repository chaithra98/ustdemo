package com.inheritance;

class ParentClass{
    int val = 10;

    class ChildClass{
        int cval = 5;
    }
}

public class Main {

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ParentClass.ChildClass childClass = parentClass.new ChildClass();

        System.out.println(parentClass.val + childClass.cval);
    }
}
