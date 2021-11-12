package abstractFactory.driver.implement;

import abstractFactory.driver.DisplayDriver;
import abstractFactory.driver.PrintDriver;
import abstractFactory.driver.ResolutionFactory;

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
