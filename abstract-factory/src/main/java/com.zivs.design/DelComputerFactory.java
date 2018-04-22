package com.zivs.design;

public class DelComputerFactory implements ComputerFactory {
    @Override
    public PC createPc() {
        return new DelPC();
    }

    @Override
    public Server createServer() {
        return new DelServer();
    }
}
