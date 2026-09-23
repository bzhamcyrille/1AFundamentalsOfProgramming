import javax.swing.JOptionPane;

public class Quiz2 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to Adobo Cooking Show");

        String name = JOptionPane.showInputDialog("Enter your name: ");
        String kiloInput = JOptionPane.showInputDialog(" How many kilo of pork will you cook?");

        double kilo = Double.parseDouble(kiloInput);

        double soySauce = kilo * 0.5;
        double vinegar = kilo * (1.0 / 3.0);

        JOptionPane.showMessageDialog(null, "The ratio of soysauce for " + kilo + " kg is =" + soySauce);
        JOptionPane.showMessageDialog(null, "The ratio of vinegar for " + kilo + " kg is =" + vinegar);


    }
}
