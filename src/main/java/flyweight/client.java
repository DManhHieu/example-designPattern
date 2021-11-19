package flyweight;

import javax.swing.*;


public class client {
    public static int wight = 500;
    public static int height =500;
    public static void main(String[] args) {

        JFrame jFrame= new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(wight,height);
        JPanel jPanel=new CircleJPanel();
        jFrame.add(jPanel);

        jFrame.validate();
        jFrame.repaint();

    }
}
