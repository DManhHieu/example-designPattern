package abstractFactory.driver;

public interface ResolutionFactory {
    DisplayDriver createDisplayDriver();
    PrintDriver createPrintDriver();
}
