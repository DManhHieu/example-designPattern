package creational.builder;

public class Person {
    private String name;
    private int age;
    private String phone;
    private String address;

    public Person(String name, int age, String phone, String address)
    {
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
    }
    @Override
    public String toString(){
        return name + "|" + age+ "|"+phone+ "|" + address;
    }
}
