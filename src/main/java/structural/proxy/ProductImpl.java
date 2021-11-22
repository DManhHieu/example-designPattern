package structural.proxy;

public class ProductImpl implements Product{
    private String name;
    private Double price;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setPrice(Double price) {
        this.price=price;
    }
}
