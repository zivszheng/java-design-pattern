package com.zivs.design;

import lombok.extern.slf4j.Slf4j;
/**
 * @description: 测试
 * @author zivs.zheng
 * @date 2018/4/18 14:33
 */
@Slf4j
public class ComputerFactoryTest {

    public static void main(String[] args) {

        ComputerFactory factory1 = FactoryMaker.makeFactory(FactoryMaker.ComputerTYpe.DEL);
        log.info(factory1.createPc().getDescription());
        log.info(factory1.createServer().getDescription());

        ComputerFactory factory2 = FactoryMaker.makeFactory(FactoryMaker.ComputerTYpe.MAC);
        log.info(factory2.createPc().getDescription());
        log.info(factory2.createServer().getDescription());
    }
}
