package com.zivs.factory;

/**
 * @param
 * @author zivs.zheng@qq.com
 * @description: 测试
 * @date 2018/4/22 13:09
 * @return
 */
public class ComputerFacctoryTest {
    public static void main(String[] args) {
        ComputerProducer del = ComputerFactory.production(ComputerEnum.DEL);
        del.production();

        ComputerProducer mac = ComputerFactory.production(ComputerEnum.MAC);
        mac.production();

        ComputerProducer lenovo = ComputerFactory.production(ComputerEnum.LENOVO);
        lenovo.production();
    }
}
