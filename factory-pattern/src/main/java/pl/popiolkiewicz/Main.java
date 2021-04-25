package pl.popiolkiewicz;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dawid Popiołkiewicz
 */
public class Main {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        List<NotificationType> notificationTypes = Arrays.asList(NotificationType.values());
        notificationTypes.forEach(type -> {
            Notification notification;
            try {
                notification = notificationFactory.createNotification(type);
                notification.send();
            } catch (IllegalArgumentException exception) {
                System.out.println("Error during creating notification: " + exception.getMessage());
            }
        });
    }

}
