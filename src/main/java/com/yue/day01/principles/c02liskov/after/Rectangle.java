package com.yue.day01.principles.c02liskov.after;

public class Rectangle implements Qudrilateral{

    private double length;
    private double width;

    @Override
    public double getLength() {
        return 0;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getWidth() {
        return 0;
    }
}
