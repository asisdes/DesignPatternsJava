package com.spring.SpringBoot.patterns.observer.Ex2;

public class Broker implements IObserver {

    String name;
    IObservable stock;

    public Broker(IObservable stock, String name)  {
        this.name = name;
        this.stock = stock;
        stock.addObserver(this);
    }

    public void stopTrade(){
        stock.deleteObserver(this);
        stock = null;
    }

    @Override
    public void update(Object o) {
        Stock.StockInfo stockInfo = (Stock.StockInfo) o;
        if (stockInfo.usd > 50) {
            System.out.println(name + " Брокер продает " + stockInfo.usd);
        } else {
            System.out.println(name + " Брокер покупает " + stockInfo.usd);
        }

    }

}
