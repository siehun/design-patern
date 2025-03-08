package com.yue.day01.principles.c04interseg.before;

/**
 * 传智防盗门，防火和防水功能，违反了接口隔离原则
 */
public class ChanzhiSafetyDoor implements SafetyDoor{

    @Override
    public void antiTheft() {

    }

    @Override
    public void fireproof() {

    }

    @Override
    public void waterproof() {

    }
}
