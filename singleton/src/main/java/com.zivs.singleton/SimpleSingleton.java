package com.zivs.singleton;

/**
 * @author zivs.zheng
 * @description: 单列模式 （该类始终只创建一次实例,非线程安全）
 * @date 2018/4/22 2:09
 */
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if (null == instance) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
