package com.design.patterndemo.structure.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType,Shape> shapeMap = new HashMap<>();

    public Shape getShape(ShapeType shapeType){
        Shape shape = shapeMap.get(shapeType);
        if (shape==null){
            switch (shapeType){
                case LINE:
                    shape = Line.builder().x(1).y(1).color("blue").length(10).build();
                    break;
                case CIRCLE:
                    shape = Circle.builder().x(1).y(1).color("red").radius(10).build();
                    break;
            }
            System.out.println("=====새로운 객체 생성=====");
            shapeMap.put(shapeType, shape);
        }
        return shape;
    }
}
