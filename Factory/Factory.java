class Factory{
    public static void main(String[] args){
        NotificationFactory factory = new NotificationFactory();

        EmailNotification email = (EmailNotification) factory.createNotification("email");
        email.notifyUser("This is a email notification");

        SmsNotification sms = (SmsNotification) factory.createNotification("sms");
        sms.notifyUser("This is a sms notification");

        PushNotification push = (PushNotification) factory.createNotification("push");
        push.notifyUser("This is a push notification");
    }
}