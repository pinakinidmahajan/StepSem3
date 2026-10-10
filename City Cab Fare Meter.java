import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++) {
            String cab = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();
            if (cab.equals("MINI") && time.equals("NIGHT")) {
                System.out.println(cab + ": night service not available");
                continue;
            }
            double rate = 0;
            if (cab.equals("MINI")) {
                rate = 10;
            } else if (cab.equals("SEDAN")) {
                rate = 14;
            } else if (cab.equals("SUV")) {
                rate = 18;
            }
            double fare = km * rate;
            if (fare < 100) {
                fare = 100;
            }
            if (time.equals("NIGHT")) {
                fare *= 1.2;
            }
            total += fare;
            System.out.printf("%s: %.2f\n", cab, fare);
        }
        System.out.printf("Total: %.2f\n", total);
    }
}