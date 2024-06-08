import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonePay {
    private String phoneNumber;
    private double balance;
    private Map<String, Double> transactions;

    public PhonePay(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.balance = 0.0;
        this.transactions = new HashMap<>();
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void makePayment(String recipientPhoneNumber, double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.put(recipientPhoneNumber, amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayTransactions() {
        System.out.println("Transaction History:");
        for (Map.Entry<String, Double> transaction : transactions.entrySet()) {
            System.out.println("Recipient Phone Number: " + transaction.getKey());
            System.out.println("Amount: " + transaction.getValue());
        }
    }

    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay("1234567890");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Balance");
            System.out.println("2. Make Payment");
            System.out.println("3. Display Transactions");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to add:");
                    double amount = scanner.nextDouble();
                    phonePay.addBalance(amount);
                    break;
                case 2:
                    System.out.println("Enter recipient phone number:");
                    String recipientPhoneNumber = scanner.next();
                    System.out.println("Enter amount to pay:");
                    double payAmount = scanner.nextDouble();
                    phonePay.makePayment(recipientPhoneNumber, payAmount);
                    break;
                case 3:
                    phonePay.displayTransactions();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

