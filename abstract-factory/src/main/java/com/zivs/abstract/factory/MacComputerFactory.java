package com.zivs.abstrat.factory;

public class MacComputerFactory implements com.zivs.abstrat.factory.ComputerFactory {
    @Override
    public com.zivs.abstrat.factory.PC createPC() {
        return new com.zivs.abstrat.factory.MacPC();
    }

    @Override
    public com.zivs.abstrat.factory.HPC createHPC() {
        return new com.zivs.abstrat.factory.MacHPC();
    }
}
