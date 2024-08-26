/*
 * @ (#) Rectangle.java   1.0     8/26/2024
 * Copyright (c) 2024 IUH, All rights reserved.
 */


package edu.iuh.fit;

/*
 * @description: Provide attribute of a Rectangle
 * @author: Nguyen Minh Hao
 * @date:  8/26/2024
 * @version:    1.0
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this(0.0, 0.0); // goi constructor cung lop->this(param)
//        this.length = 0;
//        this.width = 0;
    }

    /**
     * Description: Constructor
     * @param length
     * @param width
     * @throws IllegalArgumentException if length or width less than 0
     */
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Description: set the length of the rectangle
     * @param length
     * @throws IllegalArgumentException if length less than 0
     */
    public void setLength(double length) {
        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }
    public void setWidth(double width) {
        if (width < 0.0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getArea() {
        return this.length * this.width;
    }
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
