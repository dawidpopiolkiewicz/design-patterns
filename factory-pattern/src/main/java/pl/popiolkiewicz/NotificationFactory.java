package pl.popiolkiewicz;

/**
 * @author Dawid Popiołkiewicz
 */
public class NotificationFactory {

    public Notification createNotification(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unexpected value: " + type);
        }
    }

}
