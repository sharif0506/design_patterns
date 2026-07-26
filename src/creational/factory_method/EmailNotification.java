package creational.factory_method;

public class EmailNotification implements Notification {

    @Override
    public void send(String msg) {
        //after email sending functionality
        System.out.println("Email notification sent. Msg: " + msg);
    }
}
