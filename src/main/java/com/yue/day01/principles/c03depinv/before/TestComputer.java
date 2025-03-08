package com.yue.day01.principles.c03depinv.before;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setIntelCpu(new IntelCpu());
        computer.setKingstonMemory(new KingstonMemory());
        computer.setXiJieHardDisk(new XiJieHardDisk());
        computer.run();
    }
}
