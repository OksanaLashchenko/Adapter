public class SmsAdapter implements Notification {

    private final SmsNotification smsNotification;

    public SmsAdapter(SmsNotification smsNotification) {
        this.smsNotification = smsNotification;
    }

    @Override
    public void send(String title, String message) {
        System.out.println("Sent sms " + message + " with title " + title +  " to: "
                + smsNotification.getPhoneNumber() + " from: " + smsNotification.getSender());
    }

}
