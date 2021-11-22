package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EmployeeHandler implements InvocationHandler {
    private Product product =null;

    public EmployeeHandler(){
        this.product=new ProductImpl();
    }
    public static Product createProduct(){
        return (Product) Proxy.newProxyInstance(Product.class.getClassLoader(),
                new Class<?>[] {Product.class},new EmployeeHandler());
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        try{
            if(method.getName().equals("getName"))
                return method.invoke(product,objects);
            else throw new IllegalAccessException();
        }
        catch (InvocationTargetException e){
            e.printStackTrace(System.err);
        }
        return null;
    }
}
