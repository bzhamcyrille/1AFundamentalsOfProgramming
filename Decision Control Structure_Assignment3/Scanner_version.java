import java.util.Scanner;
public class Scanner_version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        double nsat = scanner.nextDouble();

        System.out.print("Enter Parent's Monthly Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Exam Score: ");
        double exam = scanner.nextDouble();

        scanner.close();

        double average = (nsat + exam) / 2;
        String status;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            status = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            status = "Accepted";
        } else {
            status = "For further study:";
        }

        System.out.println("Status: " + status);
    }
}