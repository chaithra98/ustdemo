package com.interfaces;

public class MainEnum {
    enum Constants{
        JAVA,
        SPRINT,
        AZURE,
        API
    }

    public static void main(String[] args) {
	// write your code here
        Constants myConst = Constants.API;
        for (Constants myconst: Constants.values()){
            System.out.println(myconst);
        }
//        switch (myConst) {
//            case JAVA:
//                System.out.println("JAVA Constant");
//                break;
//            case API:
//                System.out.println("API Constant");
//                break;
//            case AZURE:
//                System.out.println("AZURE Constant");
//                break;
//        }

        //System.out.println(myConst);
    }
}
