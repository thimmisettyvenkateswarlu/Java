import java.util.Scanner;

public class TirumalaTirupathiTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tirumala Tirupathi Tickets Booking");
        System.out.println("---------------------------------------------");

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your gender (M/F):");
        char gender = scanner.next().toUpperCase().charAt(0);

        System.out.println("Enter your ticket type (Special/Darshan):");
        String ticketType = scanner.next();

        double ticketPrice = 0;

        if (ticketType.equalsIgnoreCase("Special")) {
            ticketPrice = 300;
        } else if (ticketType.equalsIgnoreCase("Darshan")) {
            ticketPrice = 50;
        } else {
            System.out.println("Invalid ticket type");
            return;
        }

        if (age >= 65) {
            ticketPrice *= 0.5;
        }

        if (gender == 'F') {
            ticketPrice *= 0.8;
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

