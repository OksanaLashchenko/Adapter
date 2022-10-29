public class SlackNotification {

    private final String login;
    private final String apiKey;
    private final Long chatId;

    public SlackNotification(String login, String apiKey, Long chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    public String getLogin() {
        return login;
    }

    public String getApiKey() {
        return apiKey;
    }

    public Long getChatId() {
        return chatId;
    }

}
