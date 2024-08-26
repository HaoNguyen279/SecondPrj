/*
 * @ (#) TestRectangle.java   1.0     8/26/2024
 * Copyright (c) 2024 IUH, All rights reserved.
 */


package edu.iuh.fit;

/*
 * @description: main class
 * @author: Nguyen Minh Hao
 * @date:  8/26/2024
 * @version:    1.0
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 5.0);
//        r1.setLength(-10.5);
        System.out.println("Length r1:" + r1.getLength());
        System.out.println("Length r2:" + r2.getLength());

        System.out.println("Area r2:" + r2.getArea());
        System.out.println("Perimeter r2:" + r2.getPerimeter());
    }
}
