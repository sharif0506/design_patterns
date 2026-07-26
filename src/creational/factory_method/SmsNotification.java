package creational.factory_method;

public class SmsNotification implements Notification {

    @Override
    public void send(String msg) {
        // after completing sending sms
        System.out.println("SMS Notification sent. Msg:" + msg);
    }
}
