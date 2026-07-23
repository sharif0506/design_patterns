package creational.singleton;

public class Logger {

    private static Logger logger;
    public String msg;

    // private constructor to prevent creating new object
    private Logger() {
    }

    // from this single object returning ensured
    public static Logger getLoggerInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void printMessage() {
        System.out.println(this.msg);
    }
}
