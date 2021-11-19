package creational.singleton;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Write in console " +message);
    }
}
