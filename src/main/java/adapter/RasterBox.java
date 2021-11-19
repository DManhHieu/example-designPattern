package adapter;

public class RasterBox {
    private Point topLeft;
    private Point bottomRight;
    public RasterBox(Point topLeft, Point bottomRight){
        this.topLeft=topLeft;
        this.bottomRight=bottomRight;
    }
    public Point getTopLeft(){
        return topLeft;
    }
    public Point getBottomRight(){
        return bottomRight;
    }
}
