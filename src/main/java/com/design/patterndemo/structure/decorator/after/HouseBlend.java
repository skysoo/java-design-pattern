package com.design.patterndemo.structure.decorator.after;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        this.description = "하우스블렌드";
    }

    @Override
    public int cost() {
        return 5000;
    }
}
