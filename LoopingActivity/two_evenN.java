import java.util.Scanner;
public class two_evenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}