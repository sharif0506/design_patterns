package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Logger instance1 = Logger.getLoggerInstance();
        Logger instance2 = Logger.getLoggerInstance();

        instance1.msg = "Text 1";
        instance1.printMessage();

        instance2.msg = "Text 2";
        instance2.printMessage();

        // should send the updated text because of same instance
        instance1.printMessage();





    }
}
