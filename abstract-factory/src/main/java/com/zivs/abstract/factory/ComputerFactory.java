package com.zivs.abstrat.factory;

public interface ComputerFactory {
    com.zivs.abstrat.factory.PC createPC();

    com.zivs.abstrat.factory.HPC createHPC();
}