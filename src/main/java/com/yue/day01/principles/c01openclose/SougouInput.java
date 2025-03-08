package com.yue.day01.principles.c01openclose;

/**
 * 搜狗输入法
 */
public class SougouInput {
    // 聚合关系
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display() {
        skin.display();
    }

}
