import java.util.Scanner;

public class BloodDonationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Blood Donation System");
        System.out.println("----------------");

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your weight (in kg):");
        double weight = scanner.nextDouble();

        System.out.println("Enter your blood type (A/B/O/AB):");
        String bloodType = scanner.next();

        System.out.println("Enter your gender (M/F):");
        char gender = scanner.next().toUpperCase().charAt(0);

        if (age >= 18 && age <= 65) {
            if (weight >= 45) {
                if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("O") || bloodType.equals("AB")) {
                    if (gender == 'M' || gender == 'F') {
                        System.out.println("You are eligible to donate blood.");
                    } else {
                        System.out.println("Invalid gender");
                    }
                } else {
                    System.out.println("Invalid blood type");
                }
            } else {
                System.out.println("Your weight is too low to donate blood");
            }
        } else {
            System.out.println("Your age is not eligible to donate blood");
        }
    }
}

