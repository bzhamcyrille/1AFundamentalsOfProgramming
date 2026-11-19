public class CoffeeShopAnalyzer {
    public static void main(String[] args) {
        // ito yung nabenta in 7days
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        // para di malito kung alin araw yung may sales
        String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("--- Daily Sales ---");

        // check natin situation ng bawat sales, bawat araw
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }
        // lets start with 0
        int totalSales = 0;
        // Add lahat ng sales
        for (int i = 0; i < weeklySales.length; i++) {
            totalSales += weeklySales[i];
        }
        // kunin natin yugn average po
        double averageSales = (double) totalSales / weeklySales.length;

        System.out.println("\n--- Weekly Summary ---");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Gawin muna nating basis ang first day
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];

        // Magkakaalaman na dito if sino ang bida at lagapak
        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];

        // Hanapin natin yung highest at lowest sales
        for (int i = 1; i < weeklySales.length; i++) {
            //Mas mataas yung sales, mas paldo
            if (weeklySales[i] > maxSales) {
                maxSales = weeklySales[i];
                bestDay = daysOfWeek[i];
            }
            // Mas mababa, medyo slow day yarn
            if (weeklySales[i] < minSales) {
                minSales = weeklySales[i];
                worstDay = daysOfWeek[i];
            }
        }
        // print m lang
        System.out.println("\n--- Best and Worst ---");
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");

    }
}
