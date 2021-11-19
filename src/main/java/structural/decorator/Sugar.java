package structural.decorator;

public class Sugar extends DrinkDecorator{
    private double extra = 0.5;
    Sugar(Drink base) {
        super(base);
    }

    @Override
    public double getExtra() {
        return extra;
    }
}
