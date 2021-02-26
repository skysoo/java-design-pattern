package com.design.patterndemo.create.builder;

import org.checkerframework.checker.units.qual.C;

public class ShapeFactory {
    // required parameters
    private String name;
    // optional parameters
    private int size;
    private boolean isTransparency;

    private ShapeFactory(ShapeFactoryBuilder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.isTransparency = builder.isTransparency;
    }
    
    public static class ShapeFactoryBuilder {
        // required parameters
        private String name;
        // optional parameters
        private int size;
        private boolean isTransparency;

        public ShapeFactoryBuilder(String name) {
            this.name = name;
        }

        public ShapeFactoryBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public ShapeFactoryBuilder setIsTransparency(boolean isTransparency){
            this.isTransparency = isTransparency;
            return this;
        }

        public ShapeFactory build(){
            return new ShapeFactory(this);
        }
    }

    public Shape createShape() throws NullPointerException {
        if (size!=0){
            if (isTransparency)
                return new CircleWithSizeAndTransparency(size, true);
            return new CircleWithSize(size);
        } else
            return new Circle();
    }
}
