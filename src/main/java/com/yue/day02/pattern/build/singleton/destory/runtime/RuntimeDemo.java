package com.yue.day02.pattern.build.singleton.destory.runtime;

import java.io.IOException;
import java.io.InputStream;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());

        // 调用exec方法，传入一个参数
        Process process = runtime.exec("ipconfig");
        // 调用process对象的获取输入流的方法
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        // 读取数据，返回读到的字节个数
        int b = inputStream.read(arr);
        // 把字节数组转换为字符串输入到控制台
        System.out.println(new String(arr,0, b, "gbk"));
    }
}
