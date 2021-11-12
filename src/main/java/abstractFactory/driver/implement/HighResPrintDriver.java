package abstractFactory.driver.implement;

import abstractFactory.driver.PrintDriver;

public class HighResPrintDriver implements PrintDriver {
    @Override
    public void draw() {
        System.out.println("draw high Res Print Driver");
    }
}
