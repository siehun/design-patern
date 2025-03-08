package com.yue.day01.principles.c01openclose;

public class Client {
    public static void main(String[] args) {
        // 创建搜狗输入法对象
        SougouInput input = new SougouInput();
        // 创建皮肤对象
        HeimaSkin heimaSkin = new HeimaSkin();
//        DefaultSkin defaultSkin = new DefaultSkin();
        // 设置皮肤对象到输入法
//        input.setSkin(defaultSkin);
        input.setSkin(heimaSkin);
        // 显示皮肤
        input.display();
    }
}
