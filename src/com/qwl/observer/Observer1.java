package com.qwl.observer;

public class Observer1 implements Observer{
    @Override
    public void update(String s) {
        System.out.println("Observer1: " + s);
    }
}
