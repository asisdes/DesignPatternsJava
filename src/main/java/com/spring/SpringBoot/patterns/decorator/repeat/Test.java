package com.spring.SpringBoot.patterns.decorator.repeat;

public class Test {

    public static void main(String[] args) {

        Baking baking = new Cake();
        baking.about();

        baking = new Cream(baking);
        baking.about();

    }
}
