package com.design.patterndemo.structure.composite.before;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Body body;

    public Computer(Keyboard keyboard, Monitor monitor, Body body) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.body = body;
    }

    public int getPrice() {
        return keyboard.getPrice() + monitor.getPrice() + body.getPrice();
    }

    public int getPower() {
        return keyboard.getPower() + monitor.getPower() + body.getPower();
    }
}
