package builder;

public interface Builder {
    Builder age(int age);
    Builder phone(String phone);
    Builder address(String address);
    Person build();

}
