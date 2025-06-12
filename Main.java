import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookingPlatform platform = new BookingPlatform();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Booking Platform ---");
            System.out.println("1. Make a Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();

                    User user = new User(name, email);
                    Booking booking = platform.createBooking(user, service, date);
                    System.out.println("Booking Created: " + booking);
                    break;

                case 2:
                    platform.viewBookings();
                    break;

                case 3:
                    System.out.println("Thank you for using the platform!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}