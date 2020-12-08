package com.mytubevideo;

public class SqlVideoDatabase implements VideoDatabase {
    @Override
    public void store( Video video ){
        System.out.println("Storing Video Metadata in sql database....");
        System.out.println("Title: " + video.getTitle());
        System.out.println("Title: " + video.getFileName());
        System.out.println("Done...!");
    }
}
