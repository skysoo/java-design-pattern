package com.design.patterndemo.structure.decorator.after;

public class Whipping extends CondimentDecorator{
    private Beverage beverage;

    public Whipping(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 추가";
    }

    @Override
    public int cost() {
        return 500 + beverage.cost();
    }
}
