package structural.flyweight;

import java.awt.*;
import java.awt.Graphics;

public class Circle {
    Color color;
    public Circle(Color color){
        this.color=color;
    }
    public void draw(Graphics graphics, int centralX,int centralY, int radius){
        graphics.setColor(color);
        graphics.drawArc(centralX, centralY, radius*2,radius*2,0,360);
    }
}
