package com.misc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileClass {
    //something
    public static void main( String[] args ) {
        //try{

            File myFile = new File("firstfile.txt");
            myFile.delete();
            //File Info
            if(myFile.exists()){
                System.out.println("FileName" + myFile.getName());
                System.out.println("Path" + myFile.getAbsolutePath());
                System.out.println("Writable" + myFile.canWrite());
                System.out.println("Readable" + myFile.canRead());
                System.out.println("Size" + myFile.length());

            } else {
                System.out.println("The file doesn't exists");
            }

            //Reading
//            Scanner myReader = new Scanner(myFile);
//            while (myReader.hasNextLine()){
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();

            //wirting
            //File myFile = new File("D:\\java\\firstfile.txt");
//            FileWriter myWriter = new FileWriter("firstfile.txt");
//            myWriter.write("I love java");
//            myWriter.close();
//            System.out.println("successfully wrote in the file");

//        } catch (IOException e){
//            System.out.println("An Error occured");
//            e.printStackTrace();
//        }

    }
}
