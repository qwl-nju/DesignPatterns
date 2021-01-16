package com.qwl.observer;

public class Observer2 implements Observer{
    @Override
    public void update(String s) {
        System.out.println("Observer2: " + s);
    }
}
