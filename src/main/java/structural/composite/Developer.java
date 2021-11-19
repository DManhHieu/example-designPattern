package structural.composite;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name,salary);
    }

    @Override
    public void print() {
        System.out.println("Developer: "+getName() + "|" + getSalary());
    }
}
