package decorator;

public class Cream extends DrinkDecorator{
    private double extra = 0.25;
    Cream(Drink base) {
        super(base);
    }

    @Override
    public double getExtra() {
        return extra;
    }
}
