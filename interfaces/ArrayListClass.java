package com.interfaces;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
	   //ArrayList class
//        ArrayList  -> implements List(interface)  ->extends Collection
        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(18);
        grades.add(10);
        grades.add(50);
        grades.add(5);
        grades.add(90);
        Collections.sort(grades);
        for (int grade: grades){
            System.out.println(grade);
        }

        ArrayList<String> tools = new ArrayList<String>();
        tools.add("JAVA");
        tools.add("AZURE");
        tools.add("SPRING");
        tools.add("AZURE");
        tools.add("MONGODB");
        tools.add("MTLS");
        tools.add("JAVA");
        tools.set(1,"POST MAN");
        //tools.remove(2);
        //tools.clear();
        //System.out.println(tools.get(5));
        //System.out.println(tools.size());

//        int toolSize = tools.size();
//        for (int i = 0; i < toolSize; i++){
//            System.out.println(tools.get(i));
//        }
        Collections.sort(tools);
         for (String tool : tools){
             System.out.println(tool);
         }

    }
}
