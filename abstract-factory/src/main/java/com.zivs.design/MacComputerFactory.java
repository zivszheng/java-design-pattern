package com.zivs.design;

public class MacComputerFactory implements ComputerFactory {
    @Override
    public PC createPc() {
        return new MacPC();
    }

    @Override
    public Server createServer() {
        return new MacServer();
    }
}
