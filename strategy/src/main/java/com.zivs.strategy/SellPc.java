package com.zivs.strategy;

public class SellPc {

    private PcSellStrategy strategy;

    public SellPc(PcSellStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}