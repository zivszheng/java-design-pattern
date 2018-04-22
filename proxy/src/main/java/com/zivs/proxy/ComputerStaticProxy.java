package com.zivs.proxy;

import com.zivs.proxy.ComputerSell;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ComputerStaticProxy implements ComputerSell {

    ComputerSell computerSell;

    public ComputerStaticProxy(ComputerSell computerSell) {
        this.computerSell = computerSell;
    }

    @Override
    public void sell() {
        log.info(">>> proxy sell computer(you can do something) ...");
        computerSell.sell();
    }

    @Override
    public void add() {
        log.info(">>> proxy add computer(you can do something) ...");
        computerSell.add();
    }
}
