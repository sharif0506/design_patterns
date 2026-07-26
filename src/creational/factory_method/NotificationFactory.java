package creational.factory_method;

public class NotificationFactory {

    public Notification create(String notificationType) {
        switch (notificationType) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SmsNotification();
            case "push":
                return new PushNotification();
            default:
                throw new Error("Unknown Notification Type");
        }
    }
}
