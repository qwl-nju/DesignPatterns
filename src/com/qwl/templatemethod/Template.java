package com.qwl.templatemethod;

public abstract class Template {
    public abstract void method1();
    public abstract void method2();

    public void template(){
        method1();
        method2();
    }
}
