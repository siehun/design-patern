package com.yue.day01.principles.c04interseg.after;

/**
 * 传智防盗门，只有防盗和防水功能
 */
public class ItcastSafetyDoor implements AntiTheft, Fireproof{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}
