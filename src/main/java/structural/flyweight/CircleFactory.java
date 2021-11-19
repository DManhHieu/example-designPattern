package structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CircleFactory {
    private static Map<Color, Circle> circleByColor = new HashMap<>();

    public static Circle getCircle(Color color){
        if(circleByColor.isEmpty()){
            circleByColor.put(Color.RED,new Circle(Color.RED));
            circleByColor.put(Color.BLUE, new Circle(Color.BLUE));
            circleByColor.put(Color.YELLOW, new Circle(Color.YELLOW));
            circleByColor.put(Color.ORANGE, new Circle(Color.ORANGE));
            circleByColor.put(Color.BLACK, new Circle(Color.BLACK));
            circleByColor.put(Color.WHITE, new Circle(Color.WHITE));
        }
        return circleByColor.get(color);
    }

}
