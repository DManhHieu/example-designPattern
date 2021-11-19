package creational.driver.abstractFactory.implement;

import creational.driver.abstractFactory.PrintDriver;

public class HighResPrintDriver implements PrintDriver {
    @Override
    public void draw() {
        System.out.println("draw high Res Print Driver");
    }
}
