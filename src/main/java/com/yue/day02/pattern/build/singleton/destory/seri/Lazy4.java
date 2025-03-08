package com.yue.day02.pattern.build.singleton.destory.seri;

import java.io.Serializable;

/**
 * 懒汉式-静态内部类的方式
 */
public class Lazy4 implements Serializable {
    private Lazy4(){}
    private static class SingleHolder {
        private static final Lazy4 INSTANCE = new Lazy4();
    }
    public static Lazy4 getInstance() {
        return SingleHolder.INSTANCE;
    }
    private Object readResolve() {
        return SingleHolder.INSTANCE;
    }
}
