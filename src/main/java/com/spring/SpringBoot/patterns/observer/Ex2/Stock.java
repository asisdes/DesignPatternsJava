package com.spring.SpringBoot.patterns.observer.Ex2;

import java.util.ArrayList;
import java.util.Random;

public class Stock implements IObservable {

    StockInfo stockInfo;

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
            observer.update(this);
        }
    }

    static class StockInfo{
        public int usd;
        public int euro;
    }

    public Stock() {
        stockInfo = new StockInfo();
    }

    public void setRate(){
        Random random = new Random();
        stockInfo.euro = random.nextInt(50) + 50;
        stockInfo.usd = random.nextInt(50) + 50;
    }
}
