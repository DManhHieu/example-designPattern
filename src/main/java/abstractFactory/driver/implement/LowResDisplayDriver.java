package abstractFactory.driver.implement;

import abstractFactory.driver.DisplayDriver;

public class LowResDisplayDriver implements DisplayDriver {
    @Override
    public void print() {
        System.out.println("Low Res Display Driver");
    }
}
