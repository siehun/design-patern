package com.yue.day01.principles.c03depinv.after;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setMemory(new KingstonMemory());
        computer.setHardDisk(new XiJieHardDisk());
        computer.run();
    }
}
