package com.spring.SpringBoot.patterns.decorator;

public class Cream extends Goodies {

    public Cream(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return 12 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + " с кремом";
    }
}
