import java.util.Scanner;
public class CarRentalBooking
 {
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Car Rental Booking");
        System.out.println("Enter your full details");

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Choice any one car like  (Tata/Suzuki/Toyota):");
        String carPreference = scanner.next();

        System.out.println("Enter your rental duration (1-7 days):");
        int rentalDuration = scanner.nextInt();

        double totalCost = 0;

        if (carPreference.equalsIgnoreCase("Tata")) {
            if (rentalDuration <= 3) {
                totalCost = 400 * rentalDuration;
            } else {
                totalCost = 350 * rentalDuration;
            }
        } else if (carPreference.equalsIgnoreCase("Suzuki")) {
            if (rentalDuration <= 3) {
                totalCost = 500 * rentalDuration;
            } else {
                totalCost = 450 * rentalDuration;
            }
        } else if (carPreference.equalsIgnoreCase("Toyota")) {
            if (rentalDuration <= 3) {
                totalCost = 600 * rentalDuration;
            } else {
                totalCost = 550 * rentalDuration;
            }
        } else {
            System.out.println("Invalid car preference");
            return;
        }

        System.out.println("Your total cost is: " + totalCost);

        System.out.println("Do you want to book the car? (Y/N)");
        char book = scanner.next().toUpperCase().charAt(0);

        if (book == 'Y') {
            System.out.println("Car booked successfully!");
        } else {
            System.out.println("Booking cancelled");
        }
    }
}

/*This program simulates a car rental booking system where users can choose their car preference (Sedan, SUV, Luxury) and rental duration (1-7 days). It uses if-else statements to calculate the total cost based on the car preference and rental duration, and then asks the user if they want to book the car.

Note that this is a simple example and a real-world car rental booking system would have more features and functionality, such as user authentication, payment processing, and car availability checking.*/