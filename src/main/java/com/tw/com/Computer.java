package com.tw.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    public Display display;
    @Autowired
    public Host host;
    @Autowired
    public KeyBoard keyboard;
    @Autowired
    public Mouse mouse;
    @Autowired
    public Printer printer;

    public String showInformation() {
        return display.showType() + "\n" +host.showType() +"\n"+ keyboard.showType() +"\n"+ mouse.showType() +"\n"+ printer.showType();
    }
}
