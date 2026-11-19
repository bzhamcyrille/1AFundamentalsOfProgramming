import javax.swing.JOptionPane;
public class two_evenN2 {
    public static void main(String[] args) {
        String output = "";

        for (int i = 2; i <= 100; i += 2) {
            output = output + i + " ";

            if (i % 20 == 0) {
                output = output + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
