package creational.driver.abstractFactory.implement;

import creational.driver.abstractFactory.DisplayDriver;

public class LowResDisplayDriver implements DisplayDriver {
    @Override
    public void print() {
        System.out.println("Low Res Display Driver");
    }
}
