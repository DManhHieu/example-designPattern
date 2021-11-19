package adapter;

public class client {
    public static void main(String[] args){
        VectorDraw vectorDraw= new VectorDraw();
        Shape shape=new Shape(1,2,3,4);
        vectorDraw.draw(shape);

        RasterBox rasterBox=new RasterBox(new Point(1,5), new Point(3,2));

        RasterBoxAdapter rasterBoxAdapter= new RasterBoxAdapter(rasterBox);

        vectorDraw.draw(rasterBoxAdapter);

    }
}
