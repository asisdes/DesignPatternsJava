package com.spring.SpringBoot.patterns.observer.Ex1;

import java.util.ArrayList;

public class ConcreteObservable implements IObservable {

    ArrayList<IObserver> observers = new ArrayList<>();


    @Override
    public void addObserver(IObserver iObserver) {
        observers.add(iObserver);
    }

    @Override
    public void deleteObserver(IObserver iObserver) {
        deleteObserver(iObserver);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
