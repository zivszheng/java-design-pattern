package com.zivs.design;

public class DelComputerFactory implements ComputerFactory {
    @Override
    public PC createPC() {
        return new DelPC();
    }

    @Override
    public HPC createHPC() {
        return new DelHPC();
    }
}
