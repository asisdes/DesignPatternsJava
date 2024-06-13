package com.spring.SpringBoot.patterns.observer.Ex1;


public class ConcreteObserver implements IObserver {

    String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Update +" + name);
    }
}
