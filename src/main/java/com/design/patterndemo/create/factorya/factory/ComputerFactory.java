package com.design.patterndemo.create.factorya.factory;

import com.design.patterndemo.create.factorya.Brand;
import com.design.patterndemo.create.factorya.keyboard.Keyboard;
import com.design.patterndemo.create.factorya.mouse.Mouse;

/**
 * 아래 코드는 제품별 팩토리화는 되었지만 제조사별 팩토리화는 되어있지 않다.
 * 따라서 제조사와 관련된 파라미터들을 제품별 팩토리로 전달해줘야 하고, 새로운 제조사가 추가되면 각 제품별 코드를 수정해줘야 한다.
 **/
public class ComputerFactory {
    public void createComputer(Brand brand){
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();

        Keyboard keyboard = keyboardFactory.createKeyboard(brand);
        Mouse mouse = mouseFactory.createMouse(brand);

        keyboard.create();
        mouse.create();
    }
}
