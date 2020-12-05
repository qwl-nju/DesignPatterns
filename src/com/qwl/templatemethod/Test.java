package com.qwl.templatemethod;

public class Test {
    /*
     * 模板方法模式：模板方法是一样的，主流程是一样的。在每个环节，不同的子类可以有个性化的实现方式
     * */
    public static void main(String[] args) {
        Template template = new TemplateA();
        template.template();

        template = new TemplateB();
        template.template();
    }
}
