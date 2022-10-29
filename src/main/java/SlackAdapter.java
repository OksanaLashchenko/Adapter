public class SlackAdapter implements Notification {

    private final SlackNotification slackNotification;

    public SlackAdapter(SlackNotification slackNotification) {
        this.slackNotification = slackNotification;
    }

    @Override
    public void send(String title, String message) {
        System.out.println("Sent Slack message " + message + " with title " + title +  " to login: "
                + slackNotification.getLogin() + " with apiKey: " + slackNotification.getApiKey() + " to chat "
                + slackNotification.getChatId());
    }

}
