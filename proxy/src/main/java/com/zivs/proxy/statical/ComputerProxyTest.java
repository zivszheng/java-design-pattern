package com.zivs.proxy.statical;

import com.zivs.proxy.ComputerVendor;

public class ComputerProxyTest {
    public static void main(String[] args) {
        ComputerStaticProxy proxy = new ComputerStaticProxy(new ComputerVendor());
        proxy.sell();

        proxy.add();
    }
}
