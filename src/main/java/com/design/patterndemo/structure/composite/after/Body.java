package com.design.patterndemo.structure.composite.after;

import lombok.Builder;

public class Body implements ComputerDevice{
    private int price;
    private int power;

    @Builder
    public Body(int price, int power) {
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
