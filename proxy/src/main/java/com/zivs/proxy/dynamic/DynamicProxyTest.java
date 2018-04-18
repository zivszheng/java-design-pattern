package com.zivs.proxy.dynamic;

import com.zivs.proxy.ComputerSell;
import com.zivs.proxy.ComputerVendor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

@Slf4j
public class DynamicProxyTest {

    public static void main(String[] args) {
        ComputerVendor vendor = new ComputerVendor();
        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ComputerSell proxy = (ComputerSell) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{ComputerSell.class}, new DynamicProxyHandler(vendor));
        proxy.sell();
    }
}
