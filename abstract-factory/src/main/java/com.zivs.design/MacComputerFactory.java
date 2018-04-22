package com.zivs.design;

public class MacComputerFactory implements ComputerFactory {
    @Override
    public PC createPC() {
        return new MacPC();
    }

    @Override
    public HPC createHPC() {
        return new MacHPC();
    }
}
