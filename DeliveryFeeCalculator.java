import java.util.Scanner;

public class DeliveryFeeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0.0;

        for (int i = 0; i < n; i++) {
            String deliveryType = sc.next();
            double weight = sc.nextDouble();
            double distance = sc.nextDouble();
            double fee = 0.0;

            if (deliveryType.equals("STANDARD")) {
                fee = 5.0 + (0.50 * weight) + (0.10 * distance);
            } else if (deliveryType.equals("EXPRESS")) {
                fee = 15.0 + (1.00 * weight) + (0.20 * distance);
            } else if (deliveryType.equals("INTERNATIONAL")) {
                double customsFee = sc.nextDouble();
                fee = 25.0 + (2.00 * weight) + (0.50 * distance) + customsFee;
            }

            System.out.printf("%s: %.2f\n", deliveryType, fee);
            grandTotal += fee;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}