package com.design.patterndemo.structure.composite.after;

import com.google.common.collect.Lists;

import java.util.List;

public class ComputerComposite implements ComputerDevice{
    private List<ComputerDevice> components = Lists.newArrayList();

    public void addComponent(ComputerDevice device) {
        components.add(device);
    }

    public void removeComponent(ComputerDevice device){
        components.remove(device);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for(ComputerDevice component : components) {
            price += component.getPrice();
        }
        return price;
    }

    @Override
    public int getPower() {
        int power = 0;
        for(ComputerDevice component : components) {
            power += component.getPower();
        }
        return power;
    }
}
