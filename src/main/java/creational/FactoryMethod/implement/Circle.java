package creational.FactoryMethod.implement;

import creational.FactoryMethod.Shape;

public class Circle implements Shape {
    private double r;
    @Override
    public String draw() {
        return "Hinh tron: " + r;
    }
    public Circle(double r){
        this.r=r;
    }
}
