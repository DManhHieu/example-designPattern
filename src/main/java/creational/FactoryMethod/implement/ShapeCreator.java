package creational.FactoryMethod.implement;

import creational.FactoryMethod.Creator;
import creational.FactoryMethod.Shape;

public class ShapeCreator extends Creator {
    @Override
    public Shape create(String name) {
        String value= name.substring(7);
        if(name.startsWith("#rectan")){
            String[] values= value.split(",");
            return new Rectangle(Integer.parseInt(values[0].trim())
                    ,Integer.parseInt(values[1].trim()));
        }
        else {
            return new Circle(Double.parseDouble(value.trim()));
        }
    }
}
