import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;

public class thirdjava {
    public static void main(String[] args) throws IOException {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = ""; System.out.print("enter your name:");
        try {
            name = dataIn.readLine();
        }catch(IOException e) {
            System.out.println("Error!");
        }

                System.out.println("Hello " + name + "!");

    }
}

