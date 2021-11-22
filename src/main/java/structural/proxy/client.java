package structural.proxy;

public class client {
    public static void main(String[] args) {
        Product employee= EmployeeHandler.createProduct();
        printName(employee);
        Product manager= ManagerHandler.createProduct();
        printName(manager);

    }
    public static void printName(Product product){
        try{
            product.setName("ABC");
            System.out.println(product.getName());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
