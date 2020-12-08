package com.misc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Pattern class: Defines a pattern
    // Matcher Class: Used to search for the pattern
    // PatternSyntaxException:

        Pattern pattern = Pattern.compile("ustglobal", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Search for job in UstGlobal");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Match Found");
        } else {
            System.out.println("Match not found");
        }


    }
}
