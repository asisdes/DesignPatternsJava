package com.spring.SpringBoot.patterns.observer.Ex1;

public class Main {

    public static void main(String[] args) {
        IObservable observable = new ConcreteObservable();

        IObserver observer1 = new ConcreteObserver("Misha");
        IObserver observer2 = new ConcreteObserver("Kolya");
        IObserver observer3 = new ConcreteObserver("Denis");


        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        pause();

        observable.notifyObservers();

        pause();

        observable.notifyObservers();

    }

    private static void pause() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
