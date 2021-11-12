package builder;

public class client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new BuilderImpl("Hieu");
        director.constructPerson(builder);
        Person person=builder.build();
        System.out.println(person.toString());
    }
}
