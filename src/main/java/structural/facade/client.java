package structural.facade;

public class client {
    public static void main(String[] args) {
        FacadeFactory facadeFactory=new FacadeFactory();
        facadeFactory.getFacade().updateValue(2);
        System.out.println(facadeFactory.getFacade().getValue());
    }
}
