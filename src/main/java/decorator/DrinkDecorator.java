package decorator;

public abstract class DrinkDecorator  implements Drink{
    private Drink base;
    DrinkDecorator(Drink base){
        this.base=base;
    }
    @Override
    public double getCost() {
        return base.getCost() + getExtra();
    }
    public abstract double getExtra();
}
