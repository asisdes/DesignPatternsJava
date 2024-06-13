package com.spring.SpringBoot.patterns.abstractFactory;

public class JetBlackScrollBar extends ScrollBar{

    @Override
    public void toScroll(int i) {
        System.out.println("JetBlackScrollBar toScroll --- " +i);
    }
}
