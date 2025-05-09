public class NotificationFactory {
    
    public Notification createNotification(String channel) {
        if (channel == null ) return null;
        else if (channel.equalsIgnoreCase("email"))return new EmailNotification();
        else if (channel.equalsIgnoreCase("sms")) return new SmsNotification();
        else if (channel.equalsIgnoreCase("push"))return new PushNotification();
        return null;
    }
}
