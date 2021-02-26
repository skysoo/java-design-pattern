package com.design.patterndemo.create.factoryabstract.factory;

import com.design.patterndemo.create.factoryabstract.keyboard.Keyboard;
import com.design.patterndemo.create.factoryabstract.mouse.Mouse;

public interface Computer {
    Keyboard createKeyboard();
    Mouse createMouse();
}
