package creational.builder;

public class Director {
    public void constructPerson(Builder builder){
        builder.age(15);
        builder.phone("0999999");
        builder.address("VN");
    }
}
