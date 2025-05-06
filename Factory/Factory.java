public class Factory{
    public static void main(String[] args){
        NotificationFactory factory = new NotificationFactory();

        Notification email =  factory.createNotification("email");
        email.notifyUser("This is a email notification");

        Notification sms = factory.createNotification("sms");
        sms.notifyUser("This is a sms notification");

        Notification push =  factory.createNotification("push");
        push.notifyUser("This is a push notification");
    }
}