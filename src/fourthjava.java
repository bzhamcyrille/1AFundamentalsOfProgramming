import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fourthjava {
    public static void main(String[] args){
        // The name or path of the file you want to create or overwrite
        String filePath = "output.txt";
        //Wrap a FileWriter inside BufferedWinter.
        //The try-with-resources block ensures the file is closed and save automatically
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {


            writer.write("This is the first line of text.");
            writer.newLine();
            writer.write("This is the second line of the text.");
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
            System.out.println("Data successfully written to the file!");
        } catch (IOException e) {
            System.err.println("An error occured while writing to the file. ");
            e.printStackTrace();
        }
    }
}
