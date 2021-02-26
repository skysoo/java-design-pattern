package com.design.patterndemo.create.factoryabstract.factory;

import com.design.patterndemo.create.factoryabstract.keyboard.LGKeyboard;
import com.design.patterndemo.create.factoryabstract.mouse.LGMouse;

public class LGComputerFactory implements Computer{
    @Override
    public LGKeyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public LGMouse createMouse() {
        return new LGMouse();
    }
}
