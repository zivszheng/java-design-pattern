package com.zivs.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: computer 生成厂家
 * @author zivs.zheng
 * @date 2018/4/17 15:45
 */
@Slf4j
public class ComputerVendor implements ComputerSell{
    @Override
    public void sell(String computer) {
        log.info(">>> Sell computer... "+computer);
    }

    @Override
    public void add() {
        log.info(">>> Add computer...");
    }
}