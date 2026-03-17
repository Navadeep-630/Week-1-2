
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User inputs
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (in minutes): ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (in minutes): ");
        double timeViaToFinalCity = sc.nextDouble();

        // Calculations
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.6; // miles to km
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Output
        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistanceKm +
                " km and the Total Time taken is " + totalTime + " minutes");

        sc.close();
    }
}