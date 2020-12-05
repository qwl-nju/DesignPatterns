package com.qwl.prototype;

public class Test {
    /*
     * 原型模式：分为原型模式浅复制和原型模式深复制。新创建的对象，在大部分属性不变的情况下，仅对部分属性进行修改。使用原型模式可以减少对重复不变的属性
     * 进行赋值初始化操作。类似于使用原型，一键初始化。
     *
     * */

    public static void main(String[] args) {
        resumeDeep();
    }

    public static void resume(){
        Resume resumeA = new Resume();
        resumeA.setName("aa");
        resumeA.setWork(new Work("awork"));

        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setWork(new Work("bwork"));

        System.out.println(resumeA.toString());
        System.out.println(resumeB.toString());
    }

    public static void resumeDeep(){
        ResumeDeep resumeA = new ResumeDeep();
        resumeA.setName("aa");
        resumeA.setWork(new Work("awork"));

        ResumeDeep resumeB = (ResumeDeep) resumeA.clone();
        resumeB.setWork(new Work("bwork"));

        System.out.println(resumeA.toString());
        System.out.println(resumeB.toString());
    }
}
