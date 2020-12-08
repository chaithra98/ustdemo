package com.interfaces.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemoBack2 {
    public static void show(){
        try {
            var reader = new FileReader("file.txt"); //opened
            var value = reader.read(); // not able to read

        } catch (IOException ex){ // exception throws
            //ex.printStackTrace();
            System.out.println("Couldn't read the data");
        } finally {
            System.out.println("This is finally Block");
            //reader.close();?
        }

    }

//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
}
