package com.design.patterndemo.create.factoryabstract.keyboard;

public class LGKeyboard implements Keyboard{
    @Override
    public void create() {
        System.out.println("LG 제품의 키보드를 생산하였습니다.");
    }
}
