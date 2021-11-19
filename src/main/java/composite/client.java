package composite;

public class client {
    public static void main(String[] args){
        Manager manager=new Manager("Doan Manh Hieu", 20000);
        manager.add(new Developer("Doan Hieu",10000));
        manager.add(new Manager("ABC", 2000));
        manager.print();
    }
}
