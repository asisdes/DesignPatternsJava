package com.spring.SpringBoot.patterns.decorator;

public class Main {

    public static void main(String[] args) {

        Baking baking = new Cake();
        //System.out.println(baking.getDescription() + " - " + baking.getPrice());
        baking.about();
        System.out.println("-------------------------------------------");
        baking = new Cream(baking);
        baking = new Chocolate(baking);
        baking.about();
        System.out.println("-------------------------------------------");
        //System.out.println(baking.getDescription() + " - " + baking.getPrice());
        baking = new Chocolate(baking);
        baking.about();
        //System.out.println(baking.getDescription() + " - " + baking.getPrice());
    }
}