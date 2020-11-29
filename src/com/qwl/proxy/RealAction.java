package com.qwl.proxy;

public class RealAction implements Action{
    @Override
    public void doAction() {
        System.out.println("RealAction");
    }
}
