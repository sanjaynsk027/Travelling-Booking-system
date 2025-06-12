public class Booking {
    private static int idCounter = 1000;
    private int bookingId;
    private String userName;
    private String serviceName;
    private String date;

    public Booking(String userName, String serviceName, String date) {
        this.bookingId = idCounter++;
        this.userName = userName;
        this.serviceName = serviceName;
        this.date = date;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String toString() {
        return "Booking ID: " + bookingId + ", User: " + userName + ", Service: " + serviceName + ", Date: " + date;
    }
}