package com.zivs.factory;
/**
 * @description: computer factory
 * @author zivs.zheng@qq.com
 * @date 2018/4/22 13:08
 * @param
 * @return
 */
public class ComputerFactory {

    public static ComputerProducer production(ComputerEnum computerEnum) {
        switch (computerEnum) {
            case DEL:
                return new DelProducer();
            case MAC:
                return new MacProducer();
            case LENOVO:
                return new LenovoProducer();
            default:
                return null;
        }
    }
}
