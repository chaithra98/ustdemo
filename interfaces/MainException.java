package com.interfaces;

import com.interfaces.exceptions.ExceptionsDemo;

public class MainException {
    public static void main(String[] args){
        try{
            ExceptionsDemo.show();
        } catch (Throwable e){
            System.out.println("An unexpected error occured");
        }
    }
}
