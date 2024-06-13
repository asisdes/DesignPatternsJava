package com.spring.SpringBoot.patterns.observer.Ex2;


public interface IObservable {
    void addObserver(IObserver iObserver);
    void deleteObserver(IObserver iObserver);
    void notifyObservers();
}
