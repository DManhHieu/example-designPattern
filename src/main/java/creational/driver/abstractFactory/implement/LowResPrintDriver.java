package creational.driver.abstractFactory.implement;

import creational.driver.abstractFactory.PrintDriver;

public class LowResPrintDriver implements PrintDriver {
    @Override
    public void draw() {
        System.out.println("draw low res print driver");
    }
}
