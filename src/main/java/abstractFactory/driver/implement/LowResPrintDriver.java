package abstractFactory.driver.implement;

import abstractFactory.driver.PrintDriver;

public class LowResPrintDriver implements PrintDriver {
    @Override
    public void draw() {
        System.out.println("draw low res print driver");
    }
}
