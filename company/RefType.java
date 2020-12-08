package com.company;

import java.awt.*;
import java.util.Date;

public class RefType {
    public static void main(String[] args) {
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);

// Ref types vs Primitive type
        //primitive storage
//        byte x = 1;
//        byte y = x;
//        x = 2;
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
