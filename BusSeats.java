import java.util.Scanner;

public class BusSeatBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bus Seat Booking System");
     

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your seat preference (Window/Middle/Aisle):");
        String seatPreference = scanner.next();

        System.out.println("Enter your seat number (1-50):");
        int seatNumber = scanner.nextInt();

        if (seatNumber >= 1 && seatNumber <= 50) {
            if (seatPreference.equalsIgnoreCase("Window")) {
                if (seatNumber == 1 || seatNumber == 5 || seatNumber == 9 || seatNumber == 13 || seatNumber == 17 || seatNumber == 21 || seatNumber == 25 || seatNumber == 29 || seatNumber == 33 || seatNumber == 37 || seatNumber == 41 || seatNumber == 45 || seatNumber == 49) {
                    System.out.println("Your seat is booked: " + seatNumber + " (Window)");
                } else {
                    System.out.println("Sorry, window seat is not available at this number");
                }
            } else if (seatPreference.equalsIgnoreCase("Middle")) {
                if (seatNumber == 2 || seatNumber == 6 || seatNumber == 10 || seatNumber == 14 || seatNumber == 18 || seatNumber == 22 || seatNumber == 26 || seatNumber == 30 || seatNumber == 34 || seatNumber == 38 || seatNumber == 42 || seatNumber == 46 || seatNumber == 50) {
                    System.out.println("Your seat is booked: " + seatNumber + " (Middle)");
                } else {
                    System.out.println("Sorry, middle seat is not available at this number");
                }
            } else if (seatPreference.equalsIgnoreCase("Aisle")) {
                if (seatNumber == 3 || seatNumber == 7 || seatNumber == 11 || seatNumber == 15 || seatNumber == 19 || seatNumber == 23 || seatNumber == 27 || seatNumber == 31 || seatNumber == 35 || seatNumber == 39 || seatNumber == 43 || seatNumber == 47 || seatNumber == 50) {
                    System.out.println("Your seat is booked: " + seatNumber + " (Aisle)");
                } else {
                    System.out.println("Sorry, aisle seat is not available at this number");
                }
            } else {
                System.out.println("Invalid seat preference");
            }
        } else {
            System.out.println("Invalid seat number");
        }
    }
}
