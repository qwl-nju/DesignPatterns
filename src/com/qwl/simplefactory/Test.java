package com.qwl.simplefactory;

public class Test {
    /*
     * 简单工厂模式，创建获取对象的一种方式，由调用方获取对象后，自行调用对象的方法。
     *  工厂模式中只管生产实例，具体怎么使用工厂实例由调用方决定，策略模式是将生成实例的使用策略放在策略类中配置后才提供调用方使用。 工厂模式调用方可以直接调用工厂实例的方法属性等，策略模式不能直接调用实例的方法属性，需要在策略类中封装策略后调用。
     * */
    public static void main(String[] args) {
        Operation operation = OperationFactor.createOperation("+");
        System.out.println(operation.operate(1,3));
    }
}
