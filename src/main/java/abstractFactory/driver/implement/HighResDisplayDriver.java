package abstractFactory.driver.implement;

import abstractFactory.driver.DisplayDriver;

public class HighResDisplayDriver implements DisplayDriver {
    @Override
    public void print() {
        System.out.println("Print high Res Display Driver");
    }
}
