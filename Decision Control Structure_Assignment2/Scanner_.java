import java.util.Scanner;
 public class Scanner_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        scanner.close();

        double grossPay = hourlyRate * hoursWorked;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Gross Pay: Php " + grossPay);
        System.out.println("Withholding Tax: Php " + withholdingTax);
        System.out.println("Net Pay: Php " + netPay);
    }
}
