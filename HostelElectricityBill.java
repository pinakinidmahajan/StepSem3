import java.util.Scanner;

public class HostelElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0.0;

        for (int i = 0; i < n; i++) {
            String roomType = sc.next();
            double units = sc.nextDouble();
            double bill = 0.0;

            if (roomType.equals("SINGLE")) {
                bill = units * 8.0;
            } else if (roomType.equals("SHARED")) {
                int occupants = sc.nextInt();
                bill = (units * 6.0) / occupants;
            } else if (roomType.equals("AC")) {
                bill = (units * 10.0) + 200.0;
            }

            System.out.printf("%s: %.2f\n", roomType, bill);
            grandTotal += bill;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}