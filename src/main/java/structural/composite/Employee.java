package structural.composite;

public abstract class Employee {
    private String name;
    private double salary;
    public String getName(){
        return  name;
    }
    public double getSalary(){
        return salary;
    }
    public abstract void print();
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
}
