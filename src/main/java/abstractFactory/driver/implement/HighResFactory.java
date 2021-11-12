package abstractFactory.driver.implement;

import abstractFactory.driver.DisplayDriver;
import abstractFactory.driver.PrintDriver;
import abstractFactory.driver.ResolutionFactory;

public class HighResFactory implements ResolutionFactory {
    @Override
    public DisplayDriver createDisplayDriver() {
        return new HighResDisplayDriver();
    }

    @Override
    public PrintDriver createPrintDriver() {
        return new HighResPrintDriver();
    }
}
