public class DailyTempTrack {
    public static void main(String[] args) {
        double[] temperatures = new double[5]; // ito yung array na nagsstore ng 5 elements

        // iaassign mo dito yung index na nabigay sa number 2
        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        // lagay mo yung iinput ng user mamaya para maindicate yung gusto malaman
        System.out.println("Daily Temperatures: ");

        for (int i = 0; i < temperatures.length; i++) {  // gamitan natin ng for loop para magdisplay shimpri
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // tas print mo lang para makuha yung temp
            // base sa current index
        }

        // update mo yung temp
        temperatures[2] = 32.0;
        // pakita mo yung updated
        System.out.println("\nUpdated Temperature: ");
        // print mo yung bagong temp na nilagay sa taas
        System.out.println("Day 3: " + temperatures[2]);
    }
}
