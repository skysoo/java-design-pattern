package com.design.patterndemo.structure.composite.before;

/**
 * composite 패턴 적용 전
 *
 * 여기서 새로운 부품 추가시 생기는 문제
 * 1. Computer 클래스의 기능 메소드 전체 수정 불가피
 **/
public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = Keyboard.builder().price(5).power(2).build();
        Body body = Body.builder().price(100).power(70).build();
        Monitor monitor = Monitor.builder().price(20).power(30).build();

        Computer computer = new Computer(keyboard,monitor, body);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();

        System.out.println("컴퓨터 가격 : "+computerPrice);
        System.out.println("컴퓨터 전력 : "+computerPower);
    }
}
