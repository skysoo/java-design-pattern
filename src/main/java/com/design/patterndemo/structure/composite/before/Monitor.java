package com.design.patterndemo.structure.composite.before;

import lombok.Builder;

public class Monitor {
    private int price;
    private int power;

    @Builder
    public Monitor(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }
}
