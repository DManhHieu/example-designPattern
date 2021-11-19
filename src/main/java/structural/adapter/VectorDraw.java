package structural.adapter;

public class VectorDraw {
    private Shape shape;
    public void draw(Shape shape){
        System.out.println(shape.getX());
        System.out.println(shape.getY());
        System.out.println(shape.getWidth());
        System.out.println(shape.getHeight());
    }
}
