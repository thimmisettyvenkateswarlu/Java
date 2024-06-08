import java.util.Scanner;
public class TrainTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Train Ticket Booking");
        System.out.println("---------------------------------");

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your gender (M/F):");
        char gender = scanner.next().toUpperCase().charAt(0);

        System.out.println("Enter your class (First/Second/Third):");
        String trainClass = scanner.next();

        System.out.println("Enter your destination (Delhi/Mumbai/Chennai):");
        String destination = scanner.next();

        double ticketPrice = 0;

        if (trainClass.equalsIgnoreCase("First")) {
            ticketPrice = 1000;
        } else if (trainClass.equalsIgnoreCase("Second")) {
            ticketPrice = 500;
        } else if (trainClass.equalsIgnoreCase("Third")) {
            ticketPrice = 200;
        } else {
            System.out.println("Invalid class");
            return;
        }

        if (age >= 65) {
            ticketPrice *= 0.5;
        }

        if (gender == 'F') {
            ticketPrice *= 0.8;
        }

        if (destination.equalsIgnoreCase("Delhi")) {
            ticketPrice += 100;
        } else if (destination.equalsIgnoreCase("Mumbai")) {
            ticketPrice += 50;
        }

        System.out.println("Your ticket price is: " + ticketPrice);

        System.out.println("Do you want to book the ticket? (Y/N)");
        char book = scanner.next().toUpperCase().charAt(0);

        if (book == 'Y') {
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket booking cancelled");
        }
    }
}

