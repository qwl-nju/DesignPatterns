package com.qwl.decorator;

public class ConcreteDecoratorB extends Decorator{
    private String actionB;

    @Override
    public void Operation() {
        System.out.println("执行装饰器actionB");
        super.Operation();

    }
}
