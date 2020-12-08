package com.objects;

//final class Abstract { // this class can't be inherited by another classes.
//    public String fname = "Venkat";
//    public abstract void profession(); // abstract method
//}
abstract class Abstract {
    public String fname = "Venkat";
    public abstract void profession(); // abstract method
}

class Student extends Abstract {
    public int passedYear = 2019;
    public void profession() { // the body of the abstract method is provided here
        System.out.println("Training");
    }
}