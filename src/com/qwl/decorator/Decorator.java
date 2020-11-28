package com.qwl.decorator;

public class Decorator implements Component{
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        component.Operation();
    }
}
