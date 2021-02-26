package com.design.patterndemo.structure.flyweight;

public enum ShapeType {
    LINE(1000000),
    CIRCLE(700000);

    int price;

    ShapeType(int price) {
        this.price = price;
    }
}
