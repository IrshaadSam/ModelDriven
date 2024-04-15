public class Notification {
    private int notificationID;
    private String notificationDescription;

    public Notification(int notificationID, String notificationDescription) {
        this.notificationID = notificationID;
        this.notificationDescription = notificationDescription;
    }

    public int getNotificationID() {
        return notificationID;
    }
    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getNotificationDescription() {
        return notificationDescription;
    }

    public void setNotificationDescription(String notificationDescription) {
        this.notificationDescription = notificationDescription;
    }

    public void displayNotification() {
        System.out.println("Notification ID: " + notificationID);
        System.out.println("Description: " + notificationDescription);
    }

    public static void main(String[] args) {
       
        Notification notification = new Notification(1, "Test notification");
        notification.displayNotification();
    }
}
