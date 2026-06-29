public class SMSNotification extends NotificationDecorator {

    public SMSNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Adding SMS Notification");
    }
}