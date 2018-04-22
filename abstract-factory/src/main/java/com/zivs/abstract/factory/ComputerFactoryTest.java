package com.zivs.abstrat.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zivs.zheng
 * @description: 测试
 * @date 2018/4/18 14:33
 */
@Slf4j
public class ComputerFactoryTest {

    public static void main(String[] args) {

        com.zivs.abstrat.factory.ComputerFactory factory1 = com.zivs.abstrat.factory.FactoryMaker.makeFactory(com.zivs.abstrat.factory.FactoryMaker.ComputerTYpe.DEL);
        log.info(factory1.createPC().getDescription());
        log.info(factory1.createHPC().getDescription());

        com.zivs.abstrat.factory.ComputerFactory factory2 = com.zivs.abstrat.factory.FactoryMaker.makeFactory(com.zivs.abstrat.factory.FactoryMaker.ComputerTYpe.MAC);
        log.info(factory2.createPC().getDescription());
        log.info(factory2.createHPC().getDescription());
    }
}
