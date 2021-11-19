package creational.driver.abstractFactory.implement;

import creational.driver.abstractFactory.DisplayDriver;
import creational.driver.abstractFactory.PrintDriver;
import creational.driver.abstractFactory.ResolutionFactory;

public class LowResFactory implements ResolutionFactory {
    @Override
    public DisplayDriver createDisplayDriver() {
        return new LowResDisplayDriver();
    }

    @Override
    public PrintDriver createPrintDriver() {
        return new LowResPrintDriver();
    }
}
