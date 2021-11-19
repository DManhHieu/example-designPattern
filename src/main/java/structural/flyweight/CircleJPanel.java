package structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CircleJPanel  extends JPanel {
    public Color[] colors= {
            Color.RED,
            Color.BLUE,
            Color.YELLOW,
            Color.ORANGE,
            Color.BLACK,
            Color.WHITE
    };
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        randomDraw(graphics);
    }
    public void randomDraw(Graphics graphics){
        Random random=new Random();

        for (int i=0; i<1000;i++){
            CircleFactory.getCircle(colors[random.nextInt(colors.length)])
                    .draw(graphics,random.nextInt(client.wight)
                            , random.nextInt(client.height)
                            , random.nextInt((int) client.height/2));
        }
    }
}
