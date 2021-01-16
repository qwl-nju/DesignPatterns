package com.qwl.builder;

public class Test {
    /*
     * 建造者模式，Builder负责模块定义，Director负责模块组装，BuilderOne定义每个模块的内容。
     *
     * */

    public static void main(String[] args) {
        Builder builder = new BuilderOne();
        Director director = new Director();
        // 指挥者指挥建造类
        director.Construct(builder);
        Product product = builder.getProduct();
        product.print();
    }
}
