public class DecoratorPatternTest {

    public static void main(String[] args) {

        // Email only
        Notifier email = new EmailNotifier();
        email.send("Welcome!");

        System.out.println();

        // Email + SMS
        Notifier emailSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailSMS.send("Your OTP is 1234");

        System.out.println();

        // Email + SMS + Slack
        Notifier allNotifications =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        allNotifications.send("Meeting starts at 10 AM");

    }

}