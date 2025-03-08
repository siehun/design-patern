package com.yue.day02.pattern.build.singleton.destory.reflect;

/**
 * 懒汉式-静态内部类的方式
 */
public class Lazy4 {
    private static boolean flag = false;
    private Lazy4(){
        synchronized (Lazy4.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }
    private static class SingleHolder {
        private static final Lazy4 INSTANCE = new Lazy4();
    }
    public static Lazy4 getInstance() {
        return SingleHolder.INSTANCE;
    }
}
