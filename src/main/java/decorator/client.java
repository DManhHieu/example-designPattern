package decorator;

public class client {
    public static void main(String[] args) {
        DrinkDecorator drink =   new Cream(new Sugar(
                new BaseDrink(200)));
        System.out.println(drink.getCost());
    }
}
