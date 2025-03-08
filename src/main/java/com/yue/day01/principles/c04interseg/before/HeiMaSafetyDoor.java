package com.yue.day01.principles.c04interseg.before;

/**
 * 黑马防盗门，防盗防火防水功能
 */
public class HeiMaSafetyDoor implements SafetyDoor{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
