import java.util.Arrays;
public class absolutecinema {
    public static void main(String[] args){
         String[][] seats = {
                 {"Alice", "Bob", "Charlie"},   // dito na dineclare yung 2d string array na may rows
                 {"David", "Emma", "Frank"}
         };
         //pakita mo kung sino ka,
        System.out.println("Second row, third column: " + seats[1][2]);
        //palitan natin si bob kasi backburner sha
        seats[0][1] = "Vacant";
        //pakita yung updated
        System.out.println("Updated Seating Arrangement:");
        // kunin buong seating arrangement
        String result = Arrays.deepToString(seats);
        System.out.println(result);

    }
}
