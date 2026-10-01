import java.util.Scanner;

public class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            double finalAmount = 0.0;

            if (type.equals("STUDENT")) {
                finalAmount = amount * 0.90;
            } else if (type.equals("STAFF")) {
                finalAmount = amount * 0.95;
            } else if (type.equals("GUEST")) {
                finalAmount = amount + 10.0;
            }

            System.out.printf("%s: %.2f\n", type, finalAmount);
            grandTotal += finalAmount;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
        sc.close();
    }
}