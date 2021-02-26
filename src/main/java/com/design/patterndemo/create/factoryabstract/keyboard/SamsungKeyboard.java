package com.design.patterndemo.create.factoryabstract.keyboard;

public class SamsungKeyboard implements Keyboard{
    @Override
    public void create() {
        System.out.println("Samsung 제품의 키보드를 생산하였습니다.");
    }
}
