package com.yue.day01.principles.c02liskov.before;

public class RectangleDemo {
    public static void printLengthAndWidth(Rectangle rectangle) {
        // 打印长
        System.out.println("length:" + rectangle.getLength());
        // 打印宽
        System.out.println("width:" + rectangle.getWidth());
    }
    //增加宽的长度
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static void main(String[] args) {
        // 长方形
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        printLengthAndWidth(rectangle);
        System.out.println("=====================");
        // 正方形
        Square square = new Square();
        square.setLength(10);
        resize(square);
        printLengthAndWidth(square);

    }
}
