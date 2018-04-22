package com.zivs.abstrat.factory;

public class DelComputerFactory implements com.zivs.abstrat.factory.ComputerFactory {
    @Override
    public com.zivs.abstrat.factory.PC createPC() {
        return new com.zivs.abstrat.factory.DelPC();
    }

    @Override
    public com.zivs.abstrat.factory.HPC createHPC() {
        return new com.zivs.abstrat.factory.DelHPC();
    }
}
