package com.spring.SpringBoot.patterns.abstractFactory;

public class RoseGoldScrollBar extends ScrollBar{


    @Override
    public void toScroll(int i) {
        System.out.println("RoseGoldScrollBar toScroll --- " + i);
    }
}
