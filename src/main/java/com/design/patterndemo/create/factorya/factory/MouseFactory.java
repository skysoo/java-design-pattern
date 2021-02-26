package com.design.patterndemo.create.factorya.factory;

import com.design.patterndemo.create.factorya.Brand;
import com.design.patterndemo.create.factorya.mouse.LGMouse;
import com.design.patterndemo.create.factorya.mouse.Mouse;
import com.design.patterndemo.create.factorya.mouse.SamsungMouse;

public class MouseFactory {
    public Mouse createMouse(Brand brand){
        Mouse mouse = null;
        switch (brand){
            case SAMSUNG:
                mouse = new SamsungMouse(brand);
                break;
            case LG:
                mouse = new LGMouse(brand);
                break;
            default:
                System.out.println(brand + " is not definition!");
        }
        return mouse;
    }
}
