package com.qwl.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectA implements Subject{

    List<Observer> list = new ArrayList<>();

    private String status;


    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SubjectA(String status) {
        this.status = status;
    }

    public SubjectA() {
    }

    @Override
    public void notifyObserver() {
        for(Observer o : list){
            o.update(status);
        }
    }
}
