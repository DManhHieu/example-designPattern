package creational.singleton;

public class client {
    public static void main(String[] args){
        LoggerFactory loggerFactory=new LoggerFactory();
        Logger logger=loggerFactory.getLogger();
        logger.log("Doan Manh Hieu");
    }
}
