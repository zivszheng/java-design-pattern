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
        Computer pc = ComputerFactory.getComputer(new PCFactory("My PC", "8 GB", "500 GB", "2.8 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("My Server", "16 GB", "1 TB", "3.1 GHz"));
        log.info("PC     Config: " + pc);
        log.info("Server Config: " + server);
    }
}
