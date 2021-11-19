package FactoryMethod;

import FactoryMethod.implement.ShapeCreator;

public class client {
    public static void main(String[] args){
        Creator creator=new ShapeCreator();
        Shape circle = creator.create("#circle 3.7");
        Shape rectangle= creator.create("#rectan 8, 5");
        creator.addShape(circle);
        creator.addShape(rectangle);
        creator.drawAll();
    }
}
