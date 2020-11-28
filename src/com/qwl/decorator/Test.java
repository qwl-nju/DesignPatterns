package com.qwl.decorator;

public class Test {
    /*
     * 装饰器模式，ConcreteComponent为需要执行的主流程，ConcreteDecoratorA为装饰步骤，通过多层包装的方式形成对象调用链。
     * ConcreteDecoratorA中 super.Operation()的先后决定了装饰对象的调用顺序。
     *
     * */
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.Operation();
    }
}
