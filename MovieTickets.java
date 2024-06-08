import java.util.Scanner;
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Movie Ticket Booking");
        System.out.println("---------------------------------");

        System.out.println("Enter movie name:");
        String movieName = scanner.nextLine();

        System.out.println("Enter number of tickets:");
        int numTickets = scanner.nextInt();

        double totalCost = 0;

        if (numTickets <= 5) {
            totalCost = numTickets * 150;
        } else if (numTickets <= 10) {
            totalCost = numTickets * 8;
        } else {
            totalCost = numTickets * 5;
        }

        System.out.println("Your total cost is: $" + totalCost);

        System.out.println("Do you want to book the tickets? (Y/N)");
        char book = scanner.next().toUpperCase().charAt(0);

        if (book == 'Y') {
            System.out.println("Tickets booked successfully!");
            System.out.println("Your booking details:");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Number of Tickets: " + numTickets);
            System.out.println("Total Cost: $" + totalCost);
        } else {
            System.out.println("Booking cancelled");
        }
    }
}

