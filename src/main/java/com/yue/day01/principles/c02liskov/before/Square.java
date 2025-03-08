package com.yue.day01.principles.c02liskov.before;

/**
 * 正方形类
 */
public class Square extends Rectangle{

    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }
}
