package com.zivs.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: 使用动态代理，需要将要扩展的功能写在一个InvocationHandler 实现类里如下：
 * @author zivs.zheng
 * @date 2018/4/18 14:43
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理扩展逻辑
        return method.invoke(object, args);
    }
}