package com.zivs.design;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PC extends Computer {

    private String name;
    private String ram;
    private String cpu;
    private String hdd;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }
}
