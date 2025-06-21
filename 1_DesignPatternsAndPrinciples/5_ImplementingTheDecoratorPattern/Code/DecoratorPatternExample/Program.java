public class Program {
  public static void main(String[] args) {
    Notifier emailNotifier = new EmailNotifier();
    emailNotifier.send("System maintenance tonight at 10 PM.");

    System.out.println("\n--- Adding SMS Notification ---");
    Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
    smsNotifier.send("System maintenance tonight at 10 PM.");

    System.out.println("\n--- Adding SMS and Slack Notification ---");
    Notifier fullNotifier =
        new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
    fullNotifier.send("System maintenance tonight at 10 PM.");
  }
}
