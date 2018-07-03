package com.zivs.singleton;

/**
 * @author zivs.zheng
 * @description: 单列模式（静态内部类，线程安全）
 *               把 Singleton 实例放在一个静态内部类中，
 *               这样就避免了静态实例在 Singleton 类加载的时候就创建对象，
 *               并且由于静态内部类只会被加载一次，所以这种写法也是线程安全的
 * @date 2018/4/22 2:09
 */
public class Singleton {

    private static class Holder {
        private static Singleton SINGLETON = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return Holder.SINGLETON;
    }
}
