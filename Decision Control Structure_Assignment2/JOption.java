import javax.swing.JOptionPane;
public class JOption {
    public static void main(String[] args) {

        double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate:"));
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));

        double grossPay = hourlyRate * hoursWorked;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        }else if (grossPay <= 4000) {
            taxRate = 0.12;
        }else if (grossPay <= 10000) {
            taxRate = 0.15;
        }else{
            taxRate = 0.20;
        }

        double withHoldingTax = grossPay * taxRate;
        double netPay = grossPay - withHoldingTax;

        JOptionPane.showMessageDialog(null, "Gross Pay: Php " + grossPay + "\nWithholding Tax: Php " + withHoldingTax + "\nNet Pay: Php " +netPay);
    }
}