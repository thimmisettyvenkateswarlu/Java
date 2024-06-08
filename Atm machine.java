import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;

        while (true) {
            System.out.println("Welcome to ATM Machine");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int amount = scanner.nextInt();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to deposit:");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("Deposit successful");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
