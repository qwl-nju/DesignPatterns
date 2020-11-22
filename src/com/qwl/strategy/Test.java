package com.qwl.strategy;

public class Test {
    /*
    * 策略模式，屏蔽内部的策略逻辑，直接获取策略处理后的结果
    * */
    public static void main(String[] args) {
        Context context = new Context("+");
        System.out.println(context.getResult(2,3));

    }
}
