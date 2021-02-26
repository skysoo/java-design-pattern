package com.design.patterndemo.create.factorya;

public enum Brand {
    SAMSUNG(1000000),
    LG(700000);

    int price;

    Brand(int price) {
        this.price = price;
    }
}
