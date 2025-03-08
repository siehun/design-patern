package com.yue.day02.pattern.build.singleton.hungry;

/**
 * 静态代码块
 */
public class SingletonCode {
    private SingletonCode() {}
    private static SingletonCode instance;
    static {
        instance = new SingletonCode();
    }
    public static SingletonCode getInstance() {
        return instance;
    }
}
