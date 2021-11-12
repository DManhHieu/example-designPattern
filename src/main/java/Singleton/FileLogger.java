package Singleton;

public class FileLogger implements Logger{

    private static FileLogger instance;

    private  FileLogger(){
    }
    public static FileLogger getFileLogger(){
        if(instance==null){
            instance=new FileLogger();
        }
        return instance;
    }
    @Override
    public void log(String message) {
        System.out.println("Write on log.txt " + message);
    }
}
