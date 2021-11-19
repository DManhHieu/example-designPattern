package adapter;

public class RasterBoxAdapter extends Shape{
    private RasterBox rasterBox;
    public RasterBoxAdapter(RasterBox rasterBox) {
        this.rasterBox=rasterBox;
    }
    @Override
    public int getX(){
        return rasterBox.getTopLeft().getX();
    }
    @Override
    public int getY(){
        return rasterBox.getTopLeft().getY();
    }
    @Override
    public int getWidth() {
        int top =this.rasterBox.getTopLeft().getX();
        int bot= this.rasterBox.getBottomRight().getX();
        return top-bot;
    }
    @Override
    public int getHeight(){
        return rasterBox.getBottomRight().getY() - rasterBox.getTopLeft().getY();
    }
}
