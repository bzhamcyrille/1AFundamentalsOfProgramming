import javax.swing.JOptionPane;
public class three_MuchoD2 {
    public static void main(String[] args) {
        double balance = 20000;

        for (int i = 1; i > 0; i++) {
            String input = JOptionPane.showInputDialog("Enter amount:");

            if (input == null) {
                break;
            }

            double amount = Double.parseDouble(input);

            if (amount == 0) {
                i = 0;
            } else if (amount > 0) {
                balance = balance + amount;
            } else if (balance + amount >= 0) {
                balance = balance + amount;
            } else {
                JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
            }

            if (amount != 0) {
                JOptionPane.showMessageDialog(null, String.format("Outstanding balance: P%.2f", balance));
            }
        }
    }
}