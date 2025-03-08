package com.yue.day02.pattern.build.singleton.hungry;

/**
 * 饿汉式-静态变量创建类对象
 */
public class SingletonVar {
    // 私有构造方法
    private SingletonVar(){

    }
    // 在成员变量位置创建该类的对象
    private static SingletonVar instance = new SingletonVar();
    public static SingletonVar getInstance() {
        return instance;
    }
}
