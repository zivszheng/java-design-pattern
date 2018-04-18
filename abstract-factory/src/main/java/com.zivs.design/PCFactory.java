package com.zivs.design;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PCFactory implements ComputerAbstractFactory {

    private String name;
    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer createComputer() {
        return new PC(name, ram, hdd, cpu);
    }
}