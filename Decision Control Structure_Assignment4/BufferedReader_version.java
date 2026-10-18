import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_version {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter height (cm): ");
            double height = Double.parseDouble(reader.readLine());

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter citizenship ('C' for Citizen, 'N' for Non-Citizen): ");
            char citizenship = reader.readLine().toUpperCase().charAt(0);

            System.out.print("Enter recommendee ('R' for Recommendee, 'N' for Non-Recommendee): ");
            char recommendee = reader.readLine().toUpperCase().charAt(0);

            String result;
            if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
                result = "Status Accepted";
            } else {
                result = "Status Rejected";
            }

            System.out.println("\n" + result);

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }
}
