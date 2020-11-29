package com.qwl.adapter;

public class Test {
    /*
     * 适配器模式：适配器类继承自目标类，并包含需要被适配的类对象，在调用时进行适配转换
     * */
    public static void main(String[] args) {
        Target target =  new Adapter();
        target.doAction();
    }
}
