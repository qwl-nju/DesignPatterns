package com.qwl.observer;

public class Observer3 implements Observer{
    @Override
    public void update(String s) {
        System.out.println("Observer3: " + s);
    }
}
