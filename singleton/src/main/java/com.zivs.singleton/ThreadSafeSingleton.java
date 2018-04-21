package com.zivs.singleton;

/**
 * @author zivs.zheng
 * @description: Thread-safe Singleton class （Lazy Loaded）
 * @date 2018/4/22 2:09
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // protect against instantiation via reflection
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
