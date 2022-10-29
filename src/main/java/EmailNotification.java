public class EmailNotification implements Notification {

    private final String adminEmail;

    public EmailNotification(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    @Override
    public void send(String title, String message) {
        System.out.println("Sent email with title " + title + " to " + adminEmail + " that says " + message);
    }

}
