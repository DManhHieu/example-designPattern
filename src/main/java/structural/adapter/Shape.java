package structural.adapter;

public class Shape {
    private int x;
    private int y;
    private int height;
    private int width;

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public Shape(int x, int y, int height, int width){
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
    }
    public Shape(){}
}
