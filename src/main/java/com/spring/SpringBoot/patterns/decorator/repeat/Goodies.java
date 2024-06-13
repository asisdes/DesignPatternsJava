package com.spring.SpringBoot.patterns.decorator.repeat;

public abstract class Goodies implements Baking {

    Baking baking;

    public Goodies(Baking baking) {
        this.baking = baking;
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " " + getPrice());
    }
}
