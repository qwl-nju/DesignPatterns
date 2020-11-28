package com.qwl.decorator;

public class ConcreteDecoratorA extends Decorator{
    private String actionA;

    @Override
    public void Operation() {
        System.out.println("执行装饰器actionA");
        // 先后决定了装饰对象的调用顺序。
        super.Operation();
    }
}
