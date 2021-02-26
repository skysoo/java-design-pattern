package com.design.patterndemo.structure.composite.after;

import lombok.Builder;

public class Keyboard implements ComputerDevice{
    private int price;
    private int power;

    @Builder
    public Keyboard(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
