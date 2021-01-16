package com.qwl.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObserver();
}
