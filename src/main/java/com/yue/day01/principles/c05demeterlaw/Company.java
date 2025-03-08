package com.yue.day01.principles.c05demeterlaw;

/**
 * 媒体公司类
 */
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String name) {
        this.name = name;
    }
}
