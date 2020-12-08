package com.interfaces.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemoBack1 {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException e){
            System.out.println("Couldnot read the data.");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
}
