package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ManagerHandler implements InvocationHandler {
    Product product= null;
    public ManagerHandler(){
        this.product=new ProductImpl();
    }
    public static Product createProduct(){
        return (Product) Proxy.newProxyInstance(Product.class.getClassLoader(),
                new Class<?>[] {Product.class},new ManagerHandler());
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        try{
            System.out.println(method.getName());
            return method.invoke(product,objects);
        }
        catch (InvocationTargetException e){
            e.printStackTrace(System.err);
        }
        return null;
    }
}
