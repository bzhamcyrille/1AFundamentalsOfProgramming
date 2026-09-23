import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.Year;

public class Labquiz1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your birth year:");
            String yearInput = dataIn.readLine();
            int year = Integer.parseInt(yearInput);

            System.out.println("You were born last " + year + ".");
            int currentYear = Year.now().getValue();
            int age = currentYear - year;

            System.out.println("You are now " + age + " yrs old.");

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}