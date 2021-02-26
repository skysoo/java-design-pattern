package com.design.patterndemo.create.factoryabstract.factory;

import com.design.patterndemo.create.factoryabstract.keyboard.SamsungKeyboard;
import com.design.patterndemo.create.factoryabstract.mouse.SamsungMouse;

public class SamsungComputerFactory implements Computer{
    @Override
    public SamsungKeyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public SamsungMouse createMouse() {
        return new SamsungMouse();
    }
}
