package com.zivs.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Slf4j
public class DynamicProxyTest {

    public static void main(String[] args) {
        /**
         * A
         */
        ComputerSell vendor = new ComputerVendor();
        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ComputerSell proxy = (ComputerSell) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{ComputerSell.class}, new DynamicProxyHandler(vendor));
        proxy.sell("MAC");


        /**
         * B
         */
        //我们要代理的真实对象
        ComputerSell realSubject = new ComputerVendor();

        //我们要代理哪个真实对象，就将该对象传进去，最后通过该真实的对象调用该方法
        InvocationHandler handler = new DynamicProxyHandler(realSubject);

        ComputerSell subject = (ComputerSell)Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
        System.out.println(subject.getClass().getName());
        subject.add();
        subject.sell("Dell");
    }
}