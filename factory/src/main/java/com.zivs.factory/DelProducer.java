package com.zivs.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DelProducer implements ComputerProducer {
    @Override
    public void production() {
        log.info("我是生产DEL电脑的");
    }
}
