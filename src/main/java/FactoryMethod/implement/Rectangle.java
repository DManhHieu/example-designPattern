package FactoryMethod.implement;

import FactoryMethod.Shape;

public class Rectangle implements Shape {
    private int w,h;
    @Override
    public String draw() {
        return "Hinh chu nhat: "+ w + "," +h;
    }
    public Rectangle(int w, int h){
        this.w=w;
        this.h=h;
    }
}
