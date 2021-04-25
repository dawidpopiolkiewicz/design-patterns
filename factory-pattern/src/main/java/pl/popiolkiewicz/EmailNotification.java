package pl.popiolkiewicz;

/**
 * @author Dawid Popiołkiewicz
 */
public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Email notification...");
    }
}
