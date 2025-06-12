import java.util.ArrayList;
import java.util.List;

public class BookingPlatform {
    private List<Booking> bookings;

    public BookingPlatform() {
        bookings = new ArrayList<>();
    }

    public Booking createBooking(User user, String service, String date) {
        Booking booking = new Booking(user.getName(), service, date);
        bookings.add(booking);
        return booking;
    }

    public void viewBookings() {
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }
}