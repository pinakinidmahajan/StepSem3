import java.util.Scanner;

public class FestivalBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0.0;

        for (int i = 0; i < n; i++) {
            String empType = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();
            double bonus = 0.0;

            if (empType.equals("FULLTIME")) {
                bonus = salary * 0.10;
            } else if (empType.equals("PARTTIME")) {
                bonus = salary * 0.05;
            } else if (empType.equals("INTERN")) {
                bonus = 2000.0;
            }

            System.out.printf("%s: %.2f\n", name, bonus);
            grandTotal += bonus;
        }

        System.out.printf("Total Bonus: %.2f\n", grandTotal);
        sc.close();
    }
}