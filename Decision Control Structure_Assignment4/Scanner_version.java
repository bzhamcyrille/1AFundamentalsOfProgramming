import java.util.Scanner;

public class Scanner_version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter citizenship ('C' for Citizen, 'N' for Non-Citizen): ");
        char citizenship = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee ('R' for Recommendee, 'N' for Non-Recommendee): ");
        char recommendee = scanner.next().toUpperCase().charAt(0);

        String result;
        if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            result = "Status Accepted";
        } else {
            result = "Status Rejected";
        }

        System.out.println("\n" + result);

        scanner.close();
    }
}