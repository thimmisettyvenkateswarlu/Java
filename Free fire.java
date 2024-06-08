import java.util.Scanner;

public class FreeFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Free Fire");
        System.out.println("---------------------");

        System.out.println("Enter your character name:");
        String name = scanner.nextLine();

        System.out.println("Enter your weapon (Gun/Sniper/Shotgun):");
        String weapon = scanner.next();

        System.out.println("Enter your enemy's distance (Near/Far):");
        String distance = scanner.next();

        if (weapon.equalsIgnoreCase("Gun")) {
            if (distance.equalsIgnoreCase("Near")) {
                System.out.println("You hit the enemy with a headshot!");
            } else {
                System.out.println("You missed the enemy");
            }
        } else if (weapon.equalsIgnoreCase("Sniper")) {
            if (distance.equalsIgnoreCase("Far")) {
                System.out.println("You hit the enemy with a precise shot!");
            } else {
                System.out.println("You missed the enemy");
            }
        } else if (weapon.equalsIgnoreCase("Shotgun")) {
            if (distance.equalsIgnoreCase("Near")) {
                System.out.println("You hit the enemy with a powerful blast!");
            } else {
                System.out.println("You missed the enemy");
            }
        } else {
            System.out.println("Invalid weapon");
        }
    }
}
