import java.util.Scanner;
public class three_MuchoD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 20000;
        for (int i = 1; i > 0; i++) {
            System.out.print("Enter amount:");
            double amount = scanner.nextDouble();

            if (amount == 0) {
                i = 0;
            } else if (amount > 0) {
                balance = balance + amount;
            } else if (balance + amount >= 0) {
                balance = balance + amount;
            } else {
                System.out.println("INSUFFICIENT FUNDS!");
            }
            if (amount != 0) {
                System.out.printf("Outstanding balance: P%.2f%n", balance);
            }
        }
        scanner.close();
    }
}
