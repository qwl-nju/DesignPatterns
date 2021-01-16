package com.qwl.builder;

public class Product {
    private String param1;
    private String param2;

    public void setParam1(String s) {
        param1 = s;
    }

    public void setParam2(String s) {
        param2 = s;
    }

    public void print(){
        System.out.println(param1 + "#" + param2);
    }

}
