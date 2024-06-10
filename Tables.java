import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print its table:");
        int a= scanner.nextInt();
        System.out.println("Table of " + a);
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}

