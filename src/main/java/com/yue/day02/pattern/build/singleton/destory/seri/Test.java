package com.yue.day02.pattern.build.singleton.destory.seri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        writeObject2File();
        Lazy4 s1 = readObjectFromFile();
        Lazy4 s2 = readObjectFromFile();
        System.out.println(s1 == s2);
    }
    public static void writeObject2File() throws Exception {
        Lazy4 instance = Lazy4.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\fuck_learn\\heima\\design_patern\\code\\design-patern\\src\\main\\resources\\a.txt"));
        oos.writeObject(instance);
        oos.close();
    }
    public static Lazy4 readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\fuck_learn\\heima\\design_patern\\code\\design-patern\\src\\main\\resources\\a.txt"));
        Lazy4 instance = (Lazy4) ois.readObject();
        return instance;
    }
}
