import java.util.Scanner;

public class PublicTransportFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0.0;

        for (int i = 0; i < n; i++) {
            String transportType = sc.next();
            double distance = sc.nextDouble();
            double fare = 0.0;

            if (transportType.equals("BUS")) {
                fare = Math.min(10.0, 2.0 + (0.10 * distance));
            } else if (transportType.equals("TRAIN")) {
                fare = 3.0 + (0.15 * distance);
            } else if (transportType.equals("METRO")) {
                double peakHourFactor = sc.nextDouble();
                fare = (1.50 + (0.20 * distance)) * peakHourFactor;
            }

            System.out.printf("%s: %.2f\n", transportType, fare);
            grandTotal += fare;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}