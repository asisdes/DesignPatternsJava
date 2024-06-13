package com.spring.SpringBoot.patterns.observer.Ex2;

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock();

        IObserver broker1 = new Broker(stock, "Misha");
        IObserver broker2 = new Broker(stock, "Petr");
        IObserver broker3 = new Broker(stock, "Gosha");

        pause();
        stock.setRate();

        pause();
        stock.setRate();

        pause();
        stock.setRate();

        pause();
        stock.setRate();

    }

    private static void pause() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}