package com.zivs.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LenovoProducer implements ComputerProducer {
    @Override
    public void production() {
        log.info("我是生产LENOVO电脑的");
    }
}
