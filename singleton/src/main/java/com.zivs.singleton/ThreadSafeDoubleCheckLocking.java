package com.zivs.singleton;

public final class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * 使用 volatile 的主要原因是其另一个特性：禁止指令重排序优化。
     * 也就是说，在 volatile 变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），
     * 读操作不会被重排序到内存屏障之前。
     */
    public static ThreadSafeDoubleCheckLocking getInstance() {
        // 局部变量将性能提高25％
        ThreadSafeDoubleCheckLocking result = instance;
        // 检查单例实例是否被初始化。如果它被初始化可以返回实例。
        if (result == null) {
            // 没有被初始化，但是话不能确定，有可能其它线程已经初始化了。所以为了确保我们需要锁定一个对象来实现互斥。
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                // 在次将实例赋值给result，以检查它是否由其他线程初始化如果已经被初始化可直接返回。
                result = instance;
                if (result == null) {
                    // 还没有初始化，所以我们可以安全地(没有其他线程可以进入)创建一个实例。
                    instance = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }
}