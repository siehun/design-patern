package com.yue.day01.principles.c05demeterlaw;

/**
 * 明星类
 */
public class Star {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star(String name) {
        this.name = name;
    }
}
