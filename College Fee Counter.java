import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        double totalCollected = 0;
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double fee = 0;
            if (type.equals("DAY_SCHOLAR")) {
                fee = 40000 + 12000;
            } else if (type.equals("HOSTELLER")) {
                fee = 40000 + 60000;
            } else if (type.equals("SCHOLAR")) {
                fee = 20000 + 12000;
            }
            totalCollected += fee;
            System.out.printf("%s: %.2f\n", name, fee);
        }
        System.out.printf("Total Collected: %.2f\n", totalCollected);
    }
}