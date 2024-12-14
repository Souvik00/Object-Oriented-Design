public class SmsNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sms notification: " + message);
    }
    
}
