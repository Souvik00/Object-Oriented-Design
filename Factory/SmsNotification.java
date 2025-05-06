public class SmsNotification implements Notification {

    @Override
    public void notifyUser(String message) {
         System.err.println(message);
    }
   
}
