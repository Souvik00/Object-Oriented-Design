
class Singleton {
    public static void main(String[] args) {
        NotificationFactory factory = NotificationFactory.getInstance();

        Notification email = factory.createNotification("email");
        email.notifyUser("This is an email notification");

        Notification sms = factory.createNotification("sms");
        sms.notifyUser("This is an sms notification");

        Notification push = factory.createNotification("push");
        push.notifyUser("This is a push notification");
    }
}