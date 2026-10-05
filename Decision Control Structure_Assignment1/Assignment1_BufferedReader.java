import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment1_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year:");
        int year = Integer.parseInt(reader.readLine());

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
