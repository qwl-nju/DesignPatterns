package com.qwl.observer;

public class Test {
    /*
     * 观察者模式，又称为发布-订阅模式，一个主题发生变化后，更新通知所有订阅了这个主题的观察者。
     *
     * */
    public static void main(String[] args) {
        SubjectA subject = new SubjectA("SubjectA notify");

        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3 = new Observer3();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.deleteObserver(observer2);

        subject.setStatus("hdiashsdi");
        subject.notifyObserver();
    }
}
