public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Email notification: " + message);
    }
    
}
