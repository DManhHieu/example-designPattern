package creational.driver.abstractFactory;

public interface ResolutionFactory {
    DisplayDriver createDisplayDriver();
    PrintDriver createPrintDriver();
}
