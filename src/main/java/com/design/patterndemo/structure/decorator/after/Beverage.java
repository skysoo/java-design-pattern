package com.design.patterndemo.structure.decorator.after;

/**
 * 가격은 각 음료에서 처리하는 것으로 추상화
 **/
public abstract class Beverage {
    public String description = "EMPTY";

    public String getDescription() {
        return this.description;
    }

    public abstract int cost();
}
