public class DecoratorPatternTest {

    public static void main(String[] args) {

        System.out.println("Basic Notification:");
        Notification basic = new BasicNotification();
        basic.send();

        System.out.println();

        System.out.println("Email Notification:");
        Notification email =
                new EmailNotification(new BasicNotification());
        email.send();

        System.out.println();

        System.out.println("Email + SMS Notification:");
        Notification emailSms =
                new SMSNotification(
                        new EmailNotification(
                                new BasicNotification()));
        emailSms.send();

        System.out.println();

        System.out.println("Email + SMS + Slack Notification:");
        Notification all =
                new SlackNotification(
                        new SMSNotification(
                                new EmailNotification(
                                        new BasicNotification())));
        all.send();
    }
}