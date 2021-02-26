package com.design.patterndemo.create.factoryabstract.factory;


import com.design.patterndemo.create.factoryabstract.Brand;

/**
 * 제조사별 컴퓨터는 동일 제조사의 제품을 사용해야 한다.
 * 따라서 마우스, 키보드 등의 각 제품은 제조사별 공장에서 생성되어야 일관성이 보장된다.
 * 또한 새로운 제조사가 추가되더라도 새 제조사 팩토리를 만들고 아래 추가해주면 된다.
 **/
public class ComputerFactory {
    Computer computer = null;

    public void createComputer(Brand brand) {
        switch (brand){
            case SAMSUNG:
                computer = new SamsungComputerFactory();
                break;
            case LG:
                computer = new LGComputerFactory();
                break;
            default:
                System.out.println(brand + " is not definition.");
        }
        computer.createKeyboard().create();
        computer.createMouse().create();
    }
}
