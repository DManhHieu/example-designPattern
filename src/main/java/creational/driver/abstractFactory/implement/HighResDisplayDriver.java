package creational.driver.abstractFactory.implement;

import creational.driver.abstractFactory.DisplayDriver;

public class HighResDisplayDriver implements DisplayDriver {
    @Override
    public void print() {
        System.out.println("Print high Res Display Driver");
    }
}
