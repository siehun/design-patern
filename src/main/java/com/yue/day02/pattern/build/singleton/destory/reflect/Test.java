package com.yue.day02.pattern.build.singleton.destory.reflect;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception{
        Class clazz = Lazy4.class;
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Lazy4 s1 = (Lazy4) cons.newInstance();
        Lazy4 s2 = (Lazy4) cons.newInstance();
        System.out.println(s1 == s2);
    }
}
