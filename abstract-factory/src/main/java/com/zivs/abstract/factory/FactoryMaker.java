package com.zivs.abstrat.factory;

public class FactoryMaker {

    public enum ComputerTYpe {
        DEL, MAC;
    }

    public static com.zivs.abstrat.factory.ComputerFactory makeFactory(ComputerTYpe type) {
        switch (type) {
            case DEL:
                return new com.zivs.abstrat.factory.DelComputerFactory();
            case MAC:
                return new com.zivs.abstrat.factory.MacComputerFactory();
            default:
                throw new IllegalArgumentException("ComputerTYpe not supported.");
        }
    }
}