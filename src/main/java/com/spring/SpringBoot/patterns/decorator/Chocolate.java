package com.spring.SpringBoot.patterns.decorator;

public class Chocolate extends Goodies{

    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return 10 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return baking.getDescription() + " с шоколадной присыпкой";
    }
}
