public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.err.println(message);
    }
    
}
