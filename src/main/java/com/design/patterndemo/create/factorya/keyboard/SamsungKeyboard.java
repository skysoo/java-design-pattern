package com.design.patterndemo.create.factorya.keyboard;

import com.design.patterndemo.create.factorya.Brand;

public class SamsungKeyboard implements Keyboard {
    private Brand brand;

    public SamsungKeyboard(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void create() {
        System.out.println(brand + " 제품의 키보드를 생산하였습니다.");
    }
}