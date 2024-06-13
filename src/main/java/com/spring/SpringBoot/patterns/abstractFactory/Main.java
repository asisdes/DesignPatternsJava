package com.spring.SpringBoot.patterns.abstractFactory;

public class Main {

    private static GuiFactory guiFactory = new JetBlackFactory();

    public static void main(String[] args) {


        ScrollBar scrollBar = guiFactory.createScrollBar();
        scrollBar.toScroll(100);
    }

}
