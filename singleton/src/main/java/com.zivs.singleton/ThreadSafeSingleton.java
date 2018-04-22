package com.zivs.singleton;

/**
 * @author zivs.zheng
 * @description: Thread-safe SimpleSingleton class （Lazy Loaded）
 * @date 2018/4/22 2:09
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // 通过反射防止实例化
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    // 仅在第一次调用实例时才创建实例，懒加载（Lazy Loaded）
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
