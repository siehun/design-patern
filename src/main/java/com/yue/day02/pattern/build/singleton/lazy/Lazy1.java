package com.yue.day02.pattern.build.singleton.lazy;

/**
 * 懒汉式
 * 线程不安全
 */
public class Lazy1 {
    // 私有化构造方法
    private Lazy1(){}
    // 在成员位置声明类对象
    private static Lazy1 instance;
    // 提供静态方法
    public static Lazy1 getInstance() {
        if (instance == null) {
            instance = new Lazy1();
        }
        return instance;
    }



}
