public class EmailNotification extends NotificationDecorator {

    public EmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Adding Email Notification");
    }
}