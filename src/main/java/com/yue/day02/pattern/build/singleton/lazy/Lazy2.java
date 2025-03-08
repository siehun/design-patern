package com.yue.day02.pattern.build.singleton.lazy;

/**
 * 懒汉式
 * 线程安全
 */
public class Lazy2 {

    private Lazy2(){}

    private static Lazy2 instance;

    public static synchronized Lazy2 getInstance() {
        if (instance == null) {
            instance = new Lazy2();
        }
        return instance;
    }
}
