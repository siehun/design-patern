package com.yue.day01.principles.c02liskov.after;

import java.sql.PreparedStatement;

public class RectangleDemo {

    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static void printLengthAndWidth(Qudrilateral qudrilateral) {
        System.out.println("length: " + qudrilateral.getLength());
        System.out.println("width: " + qudrilateral.getWidth());
    }
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("==============");
        Square square = new Square();
        square.setSize(10);


    }
}
