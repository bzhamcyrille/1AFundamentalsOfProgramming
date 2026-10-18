import javax.swing.JOptionPane;
public class JOption_version {
    public static void main(String[] args) {

        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT Score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Parent's Monthly Salary:"));
        double exam = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam Score:"));

        double average = (nsat + exam) /2;
        String status;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            status = "Rejected";

        }else if (salary <= 3500 && average >= 91) {
            status = "Accepted";
        }else{
            status = "For further study.";
        }

        JOptionPane.showMessageDialog(null, "Status: " + status);
    }
}
