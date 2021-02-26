package com.design.patterndemo.create.factoryabstract.mouse;

public class SamsungMouse implements Mouse{
    @Override
    public void create() {
        System.out.println("Samsung 제품의 마우스를 생산하였습니다.");
    }
}
