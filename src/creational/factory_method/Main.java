package creational.factory_method;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.create("push");

        notification.send("Hi...");

        notificationFactory.create("email").send("Hello...");
    }
}
