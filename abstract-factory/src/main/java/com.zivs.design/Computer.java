package com.zivs.design;

public abstract class Computer {

    public abstract String getName();

    public abstract String getRam();

    public abstract String getCpu();

    public abstract String getHdd();

    @Override
    public String toString() {
        return "NAME=" + this.getName() + ",\tRAM=" + this.getRam() + ",\tHDD=" + this.getHdd() + ",\tCPU=" + this.getCpu();
    }
}
