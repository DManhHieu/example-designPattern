package builder;

public class BuilderImpl implements Builder{
    private String name;
    private int age;
    private String phone;
    private String address;
    public BuilderImpl(String name){
        this.name=name;
    }
    @Override
    public Builder age(int age) {
        this.age=age;
        return this;
    }

    @Override
    public Builder phone(String phone) {
        this.phone=phone;
        return this;
    }

    @Override
    public Builder address(String address) {
        this.address=address;
        return this;
    }

    @Override
    public Person build() {
        return new Person(name,age,phone,address);
    }
}
