public class SlackNotification extends NotificationDecorator {

    public SlackNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Adding Slack Notification");
    }
}