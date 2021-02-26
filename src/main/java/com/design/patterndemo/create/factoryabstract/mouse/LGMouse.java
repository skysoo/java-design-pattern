package com.design.patterndemo.create.factoryabstract.mouse;

public class LGMouse implements Mouse{
    @Override
    public void create() {
        System.out.println("LG 제품의 마우스를 생산하였습니다.");
    }
}
