import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_version {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT Score: ");
        double nsat = Double.parseDouble(reader.readLine());

        System.out.print("Enter Parent's Monthly Salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter Exam Score: ");
        double exam = Double.parseDouble(reader.readLine());

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
