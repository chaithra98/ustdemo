package com.objects;

public class StaticMethod {
    //static Method
    static void myStaticMethod(){
        System.out.println("Static methods can be called witout creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating object");
    }

    public static void main( String[] args ) {
        //myStaticMethod();

        StaticMethod staticMethod = new StaticMethod();

        staticMethod.myPublicMethod();
    }
}
