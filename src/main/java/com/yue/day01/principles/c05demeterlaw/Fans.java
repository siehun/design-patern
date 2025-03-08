package com.yue.day01.principles.c05demeterlaw;

/**
 * 粉丝类
 */
public class Fans {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fans(String name) {
        this.name = name;
    }
}
