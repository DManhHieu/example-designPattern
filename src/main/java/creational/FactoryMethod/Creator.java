package creational.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Creator {
    private List<Shape> shapeList=new ArrayList<>();
    public abstract Shape create(String name);
    public void addShape(Shape shape){
        shapeList.add(shape);
    }
    public void drawAll(){
        for (Shape shape : shapeList) {
            System.out.println(shape.draw());
        }
    }
}
