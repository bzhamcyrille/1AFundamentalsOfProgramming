import javax.swing.JOptionPane;
public class JOption_version {
    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height (cm):"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        char citizenship = JOptionPane.showInputDialog("Enter citizenship ('C' for Citizen, 'N' for Non-Citizen):").toUpperCase().charAt(0);
        char recommendee = JOptionPane.showInputDialog("Enter recommendee ('R' for Recommendee, 'N' for Non-Recommendee):").toUpperCase().charAt(0);

        String result;
        if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            result = "Status Accepted";
        } else {
            result = "Status Rejected";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}