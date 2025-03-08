package com.yue.day02.pattern.build.singleton.lazy;

/**
 * 懒汉式-静态内部类的方式
 */
public class Lazy4 {
    private Lazy4(){}
    private static class SingleHolder {
        private static final Lazy4 INSTANCE = new Lazy4();
    }
    public static Lazy4 getInstance() {
        return SingleHolder.INSTANCE;
    }
}
