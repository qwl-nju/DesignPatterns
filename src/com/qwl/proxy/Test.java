package com.qwl.proxy;

public class Test {
    /*
    * 代理模式：代理类与实际类继承自统一接口
    * */
    public static void main(String[] args) {
        Action action = new ProxyAction();
        action.doAction();
    }
}
