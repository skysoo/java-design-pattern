package com.design.patterndemo.structure.decorator.after;

public class Espresso extends Beverage{
    public Espresso() {
        this.description = "에스프레소";
    }

    @Override
    public int cost() {
        return 4000;
    }
}
