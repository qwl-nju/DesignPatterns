package com.qwl.proxy;

public class ProxyAction implements Action{
    RealAction realAction = new RealAction();

    @Override
    public void doAction() {
        System.out.println("ProxyAction before RealAction");
        realAction.doAction();
        System.out.println("ProxyAction after RealAction");

    }
}
