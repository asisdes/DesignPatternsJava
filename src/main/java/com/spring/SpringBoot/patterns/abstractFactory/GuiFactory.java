package com.spring.SpringBoot.patterns.abstractFactory;

import java.awt.*;

public abstract class GuiFactory {

    public abstract ScrollBar createScrollBar();

    public abstract Button createButton();

    public abstract TextArea createTextArea();


}
