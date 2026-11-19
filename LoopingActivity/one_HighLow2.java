import javax.swing.JOptionPane;
public class one_HighLow2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter number: ");
        if (input == null) {
            return;
        }

        int num = Integer.parseInt(input);
        int highest = num;
        int lowest = num;

        for (int i = 2; i <= 10; i++) {
            input = JOptionPane.showInputDialog("Enter number " + i + " of 10:");

            if (input == null) {
                return;
            }

            num = Integer.parseInt(input);

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        String resultMessage = "Highest: " + highest + "\nLowest: " + lowest;
        JOptionPane.showMessageDialog(null, resultMessage, "High/Low Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
