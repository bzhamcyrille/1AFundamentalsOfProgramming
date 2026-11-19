import java.util.Scanner;
public class one_HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Emter number:");
        int num = scanner.nextInt();
        int highest = num;
        int lowest = num;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number: " + i + " of 10:");
            num = scanner.nextInt();

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        scanner.close();
    }
}
