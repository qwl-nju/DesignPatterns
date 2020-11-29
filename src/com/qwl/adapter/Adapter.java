package com.qwl.adapter;

public class Adapter extends Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void doAction() {
        adaptee.push();
    }
}
