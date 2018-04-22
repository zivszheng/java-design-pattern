package com.zivs.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @param
 * @author zivs.zheng@qq.com
 * @description: 单例模式测试
 * @date 2018/4/22 2:16
 * @return
 */
@Slf4j
public class SingletonTest {

    public static void main(String[] args) {

        SimpleSingleton s1 = SimpleSingleton.getInstance();
        SimpleSingleton s2 = SimpleSingleton.getInstance();
        // 将输出true
        log.info("SimpleSingleton result:" + Objects.equals(s1, s2));

        ThreadSafeDoubleCheckLocking dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
        // 将输出true
        log.info("ThreadSafeDoubleCheckLocking result:" + Objects.equals(dcl1, dcl2));

        ThreadSafeSingleton safeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton safeSingleton2 = ThreadSafeSingleton.getInstance();
        // 将输出true
        log.info("ThreadSafeSingleton result:" + Objects.equals(safeSingleton1, safeSingleton2));

    }

}