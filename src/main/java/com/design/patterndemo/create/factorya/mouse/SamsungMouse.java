package com.design.patterndemo.create.factorya.mouse;

import com.design.patterndemo.create.factorya.Brand;

public class SamsungMouse implements Mouse {
    private Brand brand;

    public SamsungMouse(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void create() {
        System.out.println(brand + " 제품의 마우스를 생산하였습니다.");
    }
}
