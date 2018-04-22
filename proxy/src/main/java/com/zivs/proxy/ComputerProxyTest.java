package com.zivs.proxy;

public class ComputerProxyTest {
    public static void main(String[] args) {
        ComputerStaticProxy proxy = new ComputerStaticProxy(new ComputerVendor());
        proxy.sell();

        proxy.add();
    }
}
