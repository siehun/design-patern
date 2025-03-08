package com.yue.day01.principles.c05demeterlaw;

public class Test {
    public static void main(String[] args) {
        Company company = new Company("冬梅公司");
        Fans fans  = new Fans("露露");
        Agent agent = new Agent();
        Star star = new Star("白嚯嚯");
        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);
        agent.business();
        agent.meeting();

    }
}
