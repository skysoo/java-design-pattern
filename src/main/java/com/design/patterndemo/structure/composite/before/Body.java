package com.design.patterndemo.structure.composite.before;

import lombok.Builder;

public class Body {
    private int price;
    private int power;

    @Builder
    public Body(int price, int power) {
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
