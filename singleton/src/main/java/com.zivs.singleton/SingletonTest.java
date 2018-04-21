package com.zivs.singleton;

import lombok.extern.slf4j.Slf4j;
import java.util.Objects;

/**
 * @param
 * @author zivs.zheng
 * @description: 单例模式测试
 * @date 2018/4/22 2:16
 * @return
 */
@Slf4j
public class SingletonTest {

    public static void main(String[] args) {
        // 创建两个 singleton 对象
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // 将输出true
        log.info("result:" + Objects.equals(s1, s2));
    }

}