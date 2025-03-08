package com.yue.day01.principles.c02liskov.before;

/**
 * 长方形类
 */
public class Rectangle {

    private double length;
    private double width;

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
