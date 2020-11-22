package com.qwl.factory;

import com.qwl.simplefactory.Operation;

public class Test {
    /*
     * 工厂模式，功能上和简单工厂模式类似，最大的区别在于满足了开放-封闭原则，在新增操作种类时，不需要更改Factory，而是直接新增Factory的实现类即可。
     * 将显式通过switch判断的逻辑转换为多态实现。
     *
     * */
    public static void main(String[] args) {
        OperationFactory factory = new AddOperationFactory();
        Operation operation = factory.createOperation();
        System.out.println(operation.operate(2,6));

        factory = new SubOperationFactory();
        operation = factory.createOperation();
        System.out.println(operation.operate(2,6));

    }
}
