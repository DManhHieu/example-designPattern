package creational.driver.abstractFactory;

import creational.driver.abstractFactory.implement.HighResFactory;
import creational.driver.abstractFactory.implement.LowResFactory;

public class client {
    private static void useDriver(ResolutionFactory resolutionFactory){
        DisplayDriver displayDriver=resolutionFactory.createDisplayDriver();
        PrintDriver printDriver= resolutionFactory.createPrintDriver();

        printDriver.draw();
        displayDriver.print();
    }
    public static void main(String[] args){
        System.out.println("-- Abstract factory pattern -- ");
        useDriver(new LowResFactory());
        useDriver(new HighResFactory());
    }
}
