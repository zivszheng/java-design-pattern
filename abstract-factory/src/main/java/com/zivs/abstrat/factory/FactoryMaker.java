package com.zivs.abstrat.factory;

public class FactoryMaker {

    public enum ComputerTYpe {
        DEL, MAC;
    }

    public static ComputerFactory makeFactory(ComputerTYpe type) {
        switch (type) {
            case DEL:
                return new DelComputerFactory();
            case MAC:
                return new MacComputerFactory();
            default:
                throw new IllegalArgumentException("ComputerTYpe not supported.");
        }
    }
}