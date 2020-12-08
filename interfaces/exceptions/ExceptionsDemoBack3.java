package com.interfaces.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemoBack3 {
    public static void show(){
        try(
            var reader = new FileReader("file.txt");
            var writer = new FileWriter(">>>>");
        ){
            var value = reader.read();
        } catch (IOException e){
            System.out.println("Can't Read the data");
        }
    }
}
