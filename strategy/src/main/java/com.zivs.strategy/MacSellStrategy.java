package com.zivs.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DelSellStrategy implements PcSellStrategy {
    @Override
    public void execute() {
        log.info("I'm del sell strategy!");
    }
}
