package Singleton;

public class LoggerFactory {
    private FileLogger fileLogger;
    public boolean isLogFileAvaiable(){
        if(fileLogger.getFileLogger()!=null){
            return true;
        }
        return false;
    }
    public Logger getLogger(){
        if(isLogFileAvaiable()){
            return fileLogger.getFileLogger();
        }
        return new ConsoleLogger();
    }
}
