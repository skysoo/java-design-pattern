package com.design.patterndemo.create.factory;

public class ShapeFactory {
    private String shapeName;

    public Shape createShape(String shapeName) throws NullPointerException {
        this.shapeName = shapeName;
        if (shapeName != null){
            System.out.println("====새로운 객체 생성=====");
            if (shapeName.equalsIgnoreCase("CIRCLE"))
                return new Circle();
            else if (shapeName.equalsIgnoreCase("RECTANGLE"))
                return new Rectangle();
            else if (shapeName.equalsIgnoreCase("SQUARE"))
                return new Square();
            else
                throw new NullPointerException("This Class is not implementation. " + shapeName);
        } else
            return null;
    }

}
