package com.design.patterndemo.structure.composite.after;

/**
 * composite 패턴 적용 후
 *
 * 1. Computer 클래스는 각 부품으로 부터 종속적이지 않기 때문에 새로운 부품 추가시에도 Computer 클래스를 수정할 필요가 없다.
 *
 **/
public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = Keyboard.builder().price(5).power(2).build();
        Body body = Body.builder().price(100).power(70).build();
        Monitor monitor = Monitor.builder().price(20).power(30).build();

        ComputerComposite computerComposite = new ComputerComposite();
        computerComposite.addComponent(keyboard);
        computerComposite.addComponent(body);
        computerComposite.addComponent(monitor);

        ComputerComposite computerComposite1 = new ComputerComposite();
        computerComposite1.addComponent(computerComposite);

        int computerPrice = computerComposite.getPrice();
        int computerPower = computerComposite.getPower();
        System.out.println("컴퓨터 가격 : "+computerPrice);
        System.out.println("컴퓨터 전력 : "+computerPower);

        int computer1Price = computerComposite1.getPrice();
        int computer1Power = computerComposite1.getPower();
        System.out.println("컴퓨터1 가격 : "+computer1Price);
        System.out.println("컴퓨터1 전력 : "+computer1Power);
    }
}
