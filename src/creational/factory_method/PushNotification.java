package creational.factory_method;

public class PushNotification implements Notification {

    @Override
    public void send(String msg) {
        //after push notification sending functionality
        System.out.println("Push notification sent. Msg: " + msg);
    }
}
