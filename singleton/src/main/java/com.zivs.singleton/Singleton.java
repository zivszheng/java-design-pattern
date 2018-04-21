package com.zivs.singleton;
/**
 * @description: 单列模式 （该类始终只创建一次实例）
 * @author zivs.zheng
 * @date 2018/4/22 2:09
 */
public class Singleton {
    private static Singleton singleton;

    public static Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
