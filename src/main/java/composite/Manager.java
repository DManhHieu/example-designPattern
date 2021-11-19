package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private List<Employee> list=new ArrayList<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void print() {
        System.out.println("Manager: "+ getName() + "|" + getSalary());
        for (Employee em: list
             ) {
            em.print();
        }
    }
    public Manager add(Employee em){
        this.list.add(em);
        return this;
    }
    public Manager remove(Employee employee){
        this.list.remove(employee);
        return this;
    }
    public Employee getChild(int index){
        return list.get(index);
    }
}
