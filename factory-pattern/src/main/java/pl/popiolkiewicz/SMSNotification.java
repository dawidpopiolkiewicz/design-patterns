package pl.popiolkiewicz;

/**
 * @author Dawid Popiołkiewicz
 */
public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS notification...");
    }
}
