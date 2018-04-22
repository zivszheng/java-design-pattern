package com.zivs.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        SellPc s1 = new SellPc(new MacSellStrategy());
        s1.executeStrategy();
        SellPc s2 = new SellPc(new DelSellStrategy());
        s2.executeStrategy();
    }

}
