package com.yue.day01.principles.c02liskov.after;

public class Square implements Qudrilateral{

    private double size;

    @Override
    public double getLength() {
        return size;
    }

    @Override
    public double getWidth() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }
}
