import java.time.LocalDate;
import java.util.Scanner;

public class StreamingPlanRenewal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String planType = sc.next();
            String name = sc.next();
            String startDateStr = sc.next();

            LocalDate startDate = LocalDate.parse(startDateStr);
            LocalDate renewalDate = startDate;

            if (planType.equals("BASIC")) {
                renewalDate = startDate.plusDays(30);
            } else if (planType.equals("STANDARD")) {
                renewalDate = startDate.plusDays(90);
            } else if (planType.equals("PREMIUM")) {
                renewalDate = startDate.plusDays(365);
            }

            System.out.println(name + ": " + renewalDate);
        }

        sc.close();
    }
}