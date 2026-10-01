import java.util.Scanner;

public class PaymentSystemFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0.0;

        for (int i = 0; i < n; i++) {
            String paymentType = sc.next();
            double amount = sc.nextDouble();
            double adjustedAmount = amount;

            if (paymentType.equals("CARD")) {
                adjustedAmount = amount * 1.02;
            } else if (paymentType.equals("WALLET")) {
                adjustedAmount = amount * 1.01;
            } else if (paymentType.equals("BANKTRANSFER")) {
                adjustedAmount = amount;
            }

            System.out.printf("%s: %.2f\n", paymentType, adjustedAmount);
            grandTotal += adjustedAmount;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}