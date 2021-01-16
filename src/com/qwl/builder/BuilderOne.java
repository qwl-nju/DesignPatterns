package com.qwl.builder;

public class BuilderOne implements Builder{
    Product product = new Product();

    @Override
    public void builderPart1() {
        product.setParam1("BuilderOneP1");
    }

    @Override
    public void builderPart2() {
        product.setParam2("BuilderOneP2");

    }

    @Override
    public Product getProduct() {
        return product;
    }
}
