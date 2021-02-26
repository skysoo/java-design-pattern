package com.design.patterndemo.create.factorya.factory;

import com.design.patterndemo.create.factorya.Brand;
import com.design.patterndemo.create.factorya.keyboard.Keyboard;
import com.design.patterndemo.create.factorya.keyboard.LGKeyboard;
import com.design.patterndemo.create.factorya.keyboard.SamsungKeyboard;

public class KeyboardFactory  {
    public Keyboard createKeyboard(Brand brand){
        Keyboard keyboard = null;
        switch (brand){
            case SAMSUNG:
                keyboard = new SamsungKeyboard(brand);
                break;
            case LG:
                keyboard = new LGKeyboard(brand);
                break;
            default:
                System.out.println(brand + " is not definition!");
        }
        return keyboard;
    }
}
