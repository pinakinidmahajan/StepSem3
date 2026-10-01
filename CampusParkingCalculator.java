import java.util.Scanner;

public class CampusParkingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0.0;

        for (int i = 0; i < n; i++) {
            String vehicleType = sc.next();
            int hours = sc.nextInt();
            double charge = 0.0;

            if (vehicleType.equals("BIKE")) {
                charge = hours * 10.0;
            } else if (vehicleType.equals("CAR")) {
                charge = 30.0 + Math.max(0, hours - 1) * 20.0;
            } else if (vehicleType.equals("TRUCK")) {
                charge = Math.max(100.0, hours * 50.0);
            }

            System.out.printf("%s: %.2f\n", vehicleType, charge);
            grandTotal += charge;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}