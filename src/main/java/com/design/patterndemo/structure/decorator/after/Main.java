package com.design.patterndemo.structure.decorator.after;

/**
 * 음료 제조에 있어서 다양한 옵션들을 동적으로 추가할 수 있고 그 과정에서 기존 코드를 수정하지 않아도 된다.
 **/
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " cost: "+beverage.cost());

        Beverage beverageWithWhipping = new Whipping(beverage);
        System.out.println(beverageWithWhipping.getDescription() + " cost: "+beverageWithWhipping.cost());

        Beverage beverageWithMochaAndWhipping = new Mocha(beverageWithWhipping);
        System.out.println(beverageWithMochaAndWhipping.getDescription()+
                " cost: "+beverageWithMochaAndWhipping.cost());
    }
}
