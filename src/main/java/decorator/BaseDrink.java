package decorator;

public class BaseDrink  implements  Drink{
    private double cost;
    @Override
    public double getCost() {
        return cost;
    }
    public BaseDrink(double cost){
        this.cost=cost;
    }

}

