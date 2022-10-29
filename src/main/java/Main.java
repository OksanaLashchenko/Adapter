public class Main {

    public static void main(String[] args) {
        Notification notification1 = new EmailNotification("oksana@yahoo.com");
        SlackNotification slackNotification = new SlackNotification("oksana", "key", 10L);
        SmsNotification smsNotification = new SmsNotification("CompanyA", "9804610");

        notification1.send("You'got a chance!", "Use your chance!");

        SlackAdapter slackAdapter = new SlackAdapter(slackNotification);
        SmsAdapter smsAdapter = new SmsAdapter(smsNotification);

        slackAdapter.send("You'got a chance!", "Use your chance!");
        smsAdapter.send("You'got a chance!", "Use your chance!");
    }

}
