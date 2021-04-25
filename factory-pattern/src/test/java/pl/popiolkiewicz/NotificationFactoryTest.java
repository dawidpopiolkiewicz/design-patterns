package pl.popiolkiewicz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Dawid Popiołkiewicz
 */
public class NotificationFactoryTest {

    private static NotificationFactory notificationFactory;

    @BeforeAll
    public static void setup() {
        notificationFactory = new NotificationFactory();
    }

    @Test
    void shouldCreateEmailNotificationInstance() {
        Notification notification = notificationFactory.createNotification(NotificationType.EMAIL);
        assertSame(notification.getClass(), EmailNotification.class);
    }

    @Test
    void shouldCreateSmsNotificationInstance() {
        Notification notification = notificationFactory.createNotification(NotificationType.SMS);
        assertSame(notification.getClass(), SMSNotification.class);
    }

    @Test
    void shouldThrownIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> notificationFactory.createNotification(NotificationType.PUSH));
    }

    @Test
    void shouldThrownIllegalArgumentExceptionWithMessage() {
        final String EXPECTED_MESSAGE = "Unexpected value: PUSH";
        Throwable exceptionThatWasThrown = assertThrows(IllegalArgumentException.class, () -> notificationFactory.createNotification(NotificationType.PUSH));
        assertEquals(exceptionThatWasThrown.getMessage(), EXPECTED_MESSAGE);
        Calendar instance = Calendar.getInstance(TimeZone.getDefault());
    }


}
