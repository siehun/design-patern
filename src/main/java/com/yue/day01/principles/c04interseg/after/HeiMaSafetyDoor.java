package com.yue.day01.principles.c04interseg.after;

public class HeiMaSafetyDoor implements AntiTheft, Fireproof, Waterproof{
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
