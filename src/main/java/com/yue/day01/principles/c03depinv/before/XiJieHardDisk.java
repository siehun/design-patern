package com.yue.day01.principles.c03depinv.before;

/**
 * 希尔硬盘
 */
public class XiJieHardDisk {
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据");
    }
    public String get() {
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
