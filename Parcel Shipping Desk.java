import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();
            double charge = 0;
            double insurance = 0;
            if (type.equals("STANDARD")) {
                charge = 40 + (10 * weight);
                insurance = 0;
            } else if (type.equals("EXPRESS")) {
                charge = 80 + (15 * weight);
                insurance = 0.02 * value;
            } else if (type.equals("FRAGILE")) {
                charge = 40 + (10 * weight) + 50;
                insurance = 0.02 * value;
            }
            double total = charge + insurance;
            grandTotal += total;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f\n", type, charge, insurance, total);
        }
        System.out.printf("Grand Total: %.2f\n", grandTotal);
    }
}